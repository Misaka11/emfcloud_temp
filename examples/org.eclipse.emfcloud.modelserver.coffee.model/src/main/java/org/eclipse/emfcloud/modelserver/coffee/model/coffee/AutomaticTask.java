/**
 * generated by Xtext 2.19.0
 */
package org.eclipse.emfcloud.modelserver.coffee.model.coffee;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automatic Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.modelserver.coffee.model.coffee.AutomaticTask#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.modelserver.coffee.model.coffee.AutomaticTask#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.modelserver.coffee.model.coffee.AutomaticTask#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emfcloud.modelserver.coffee.model.coffee.CoffeePackage#getAutomaticTask()
 * @model
 * @generated
 */
public interface AutomaticTask extends Node
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emfcloud.modelserver.coffee.model.coffee.CoffeePackage#getAutomaticTask_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emfcloud.modelserver.coffee.model.coffee.AutomaticTask#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(String)
   * @see org.eclipse.emfcloud.modelserver.coffee.model.coffee.CoffeePackage#getAutomaticTask_Duration()
   * @model
   * @generated
   */
  String getDuration();

  /**
   * Sets the value of the '{@link org.eclipse.emfcloud.modelserver.coffee.model.coffee.AutomaticTask#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(String value);

  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(Component)
   * @see org.eclipse.emfcloud.modelserver.coffee.model.coffee.CoffeePackage#getAutomaticTask_Component()
   * @model
   * @generated
   */
  Component getComponent();

  /**
   * Sets the value of the '{@link org.eclipse.emfcloud.modelserver.coffee.model.coffee.AutomaticTask#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Component value);

} // AutomaticTask