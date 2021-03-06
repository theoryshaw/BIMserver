package org.bimserver.notifications;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.Query;
import org.bimserver.endpoints.EndPoint;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.bimserver.models.store.UserType;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;

public class NewRevisionOnSpecificProjectTopic extends Topic {

	private long poid;

	public NewRevisionOnSpecificProjectTopic(long poid) {
		this.poid = poid;
	}
	
	public void register(EndPoint endPoint) throws TopicRegisterException {
		// TODO check rights here too
		super.register(endPoint);
	}

	public void process(final DatabaseSession session, final long poid, final long roid, NewRevisionNotification newRevisionNotification) throws BimserverDatabaseException, UserException, ServerException {
		map(new Mapper(){
			@Override
			public void map(EndPoint endPoint) throws UserException, ServerException, BimserverDatabaseException {
				User user = session.get(StorePackage.eINSTANCE.getUser(), endPoint.getUoid(), Query.getDefault());
				Project notificationProject = session.get(StorePackage.eINSTANCE.getUser(), poid, Query.getDefault());
				Project registrationProject = session.get(StorePackage.eINSTANCE.getUser(), NewRevisionOnSpecificProjectTopic.this.poid, Query.getDefault());
				if (notificationProject.getOid() == registrationProject.getOid()) {
					if (user.getUserType() == UserType.ADMIN || user.getHasRightsOn().contains(notificationProject)) {
						endPoint.getNotificationInterface().newRevision(poid, roid);
					}
				}
			}});
	}
}
