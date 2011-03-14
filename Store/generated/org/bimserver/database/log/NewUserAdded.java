/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.database.log;

import org.bimserver.database.store.User;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New User Added</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.database.log.NewUserAdded#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.database.log.LogPackage#getNewUserAdded()
 * @model
 * @generated
 */
public interface NewUserAdded extends LogAction {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.bimserver.database.log.LogPackage#getNewUserAdded_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.bimserver.database.log.NewUserAdded#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // NewUserAdded