package daomappers_pkg.data_definitions__pkg.customer_repo;

//Customer Definition
//This class Defined Data Access Objects Definition
//Provide abstract view for persistence layer

/**
 * @author melanrashitha
 * @date Sep 21, 2019
 * @FileName CustomerDAO.java
 */
public class CustomerDAO {

	private String customerFirstNameString;
	private String customerLastNameString;
	private String customerDOBString;
	private String identityNumberString;
	private String customerAddressString;
	private String customerCurrencyMethod;


	public CustomerDAO(String customerFirstNameString, String customerLastNameString, String customerDOBString,
			String identityNumberString, String customerAddressString, String customerCurrencyMethod) {
		super();
		this.customerFirstNameString = customerFirstNameString;
		this.customerLastNameString = customerLastNameString;
		this.customerDOBString = customerDOBString;
		this.identityNumberString = identityNumberString;
		this.customerAddressString = customerAddressString;
		this.customerCurrencyMethod = customerCurrencyMethod;
	}


	public String getCustomerFirstNameString() {
		return customerFirstNameString;
	}


	public void setCustomerFirstNameString(String customerFirstNameString) {
		this.customerFirstNameString = customerFirstNameString;
	}


	public String getCustomerLastNameString() {
		return customerLastNameString;
	}


	public void setCustomerLastNameString(String customerLastNameString) {
		this.customerLastNameString = customerLastNameString;
	}


	public String getCustomerDOBString() {
		return customerDOBString;
	}


	public void setCustomerDOBString(String customerDOBString) {
		this.customerDOBString = customerDOBString;
	}


	public String getIdentityNumberString() {
		return identityNumberString;
	}


	public void setIdentityNumberString(String identityNumberString) {
		this.identityNumberString = identityNumberString;
	}


	public String getCustomerAddressString() {
		return customerAddressString;
	}


	public void setCustomerAddressString(String customerAddressString) {
		this.customerAddressString = customerAddressString;
	}


	public String getCustomerCurrencyMethod() {
		return customerCurrencyMethod;
	}


	public void setCustomerCurrencyMethod(String customerCurrencyMethod) {
		this.customerCurrencyMethod = customerCurrencyMethod;
	}

}
