/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.store.util;

import org.bimserver.models.store.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.store.StorePackage
 * @generated
 */
public class StoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreSwitch<Adapter> modelSwitch =
		new StoreSwitch<Adapter>() {
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseClash(Clash object) {
				return createClashAdapter();
			}
			@Override
			public Adapter caseEidClash(EidClash object) {
				return createEidClashAdapter();
			}
			@Override
			public Adapter caseGuidClash(GuidClash object) {
				return createGuidClashAdapter();
			}
			@Override
			public Adapter caseClashDetectionSettings(ClashDetectionSettings object) {
				return createClashDetectionSettingsAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object) {
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseConcreteRevision(ConcreteRevision object) {
				return createConcreteRevisionAdapter();
			}
			@Override
			public Adapter caseGeoTag(GeoTag object) {
				return createGeoTagAdapter();
			}
			@Override
			public Adapter caseCheckout(Checkout object) {
				return createCheckoutAdapter();
			}
			@Override
			public Adapter caseSettings(Settings object) {
				return createSettingsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.Clash <em>Clash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.Clash
	 * @generated
	 */
	public Adapter createClashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.EidClash <em>Eid Clash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.EidClash
	 * @generated
	 */
	public Adapter createEidClashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.GuidClash <em>Guid Clash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.GuidClash
	 * @generated
	 */
	public Adapter createGuidClashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.ClashDetectionSettings <em>Clash Detection Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.ClashDetectionSettings
	 * @generated
	 */
	public Adapter createClashDetectionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.ConcreteRevision <em>Concrete Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.ConcreteRevision
	 * @generated
	 */
	public Adapter createConcreteRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.GeoTag <em>Geo Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.GeoTag
	 * @generated
	 */
	public Adapter createGeoTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.Checkout <em>Checkout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.Checkout
	 * @generated
	 */
	public Adapter createCheckoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.store.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.store.Settings
	 * @generated
	 */
	public Adapter createSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StoreAdapterFactory