package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationPage {

	@FindBy(how = How.XPATH, using = "//*[@class='login']")
	private WebElement loginbutton;

	@FindBy(how = How.XPATH, using = "//*[@id='email']")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@id='passwd']")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id='SubmitLogin']")
	private WebElement signinbutton;

	@FindBy(how = How.XPATH, using = "(//*[@title='Dresses'])[2]")
	private WebElement dressbutton;

	@FindBy(how = How.XPATH, using = "//*[@itemprop='price']")
	private WebElement pricevalues;

	@FindBy(how = How.XPATH, using = "(//*[@itemprop='price'])[2]")
	private WebElement p1;
	@FindBy(how = How.XPATH, using = "(//*[@itemprop='price'])[4]")
	private WebElement p2;
	@FindBy(how = How.XPATH, using = "(//*[@itemprop='price'])[6]")
	private WebElement p3;
	@FindBy(how = How.XPATH, using = "(//*[@itemprop='price'])[8]")
	private WebElement p4;
	@FindBy(how = How.XPATH, using = "(//*[@itemprop='price'])[10]")
	private WebElement p5;

	@FindBy(how = How.XPATH, using = "(//*[@class='right-block'])[2]")
	private WebElement rightblock;
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Add to cart')])[2]")
	private WebElement addtocart;
	@FindBy(how = How.XPATH, using = "(//*[@class='icon-chevron-right right'])[2]")
	private WebElement proceedtocheckout;

	@FindBy(how = How.XPATH, using = "//*[@id='total_product']")
	private WebElement product;
	@FindBy(how = How.XPATH, using = "//*[@id='total_shipping']")
	private WebElement shipping;
	@FindBy(how = How.XPATH, using = "//*[@id='total_price']")
	private WebElement total;

	@FindBy(how = How.XPATH, using = "//*[@title='Log me out']")
	private WebElement logout;

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSigninbutton() {
		return signinbutton;
	}

	public void setSigninbutton(WebElement signinbutton) {
		this.signinbutton = signinbutton;
	}

	public WebElement getDressbutton() {
		return dressbutton;
	}

	public void setDressbutton(WebElement dressbutton) {
		this.dressbutton = dressbutton;
	}

	public WebElement getPricevalues() {
		return pricevalues;
	}

	public void setPricevalues(WebElement pricevalues) {
		this.pricevalues = pricevalues;
	}

	public WebElement getP1() {
		return p1;
	}

	public void setP1(WebElement p1) {
		this.p1 = p1;
	}

	public WebElement getP2() {
		return p2;
	}

	public void setP2(WebElement p2) {
		this.p2 = p2;
	}

	public WebElement getP3() {
		return p3;
	}

	public void setP3(WebElement p3) {
		this.p3 = p3;
	}

	public WebElement getP4() {
		return p4;
	}

	public void setP4(WebElement p4) {
		this.p4 = p4;
	}

	public WebElement getP5() {
		return p5;
	}

	public void setP5(WebElement p5) {
		this.p5 = p5;
	}

	public WebElement getRightblock() {
		return rightblock;
	}

	public void setRightblock(WebElement rightblock) {
		this.rightblock = rightblock;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public void setAddtocart(WebElement addtocart) {
		this.addtocart = addtocart;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

	public void setProceedtocheckout(WebElement proceedtocheckout) {
		this.proceedtocheckout = proceedtocheckout;
	}

	public WebElement getProduct() {
		return product;
	}

	public void setProduct(WebElement product) {
		this.product = product;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public void setShipping(WebElement shipping) {
		this.shipping = shipping;
	}

	public WebElement getTotal() {
		return total;
	}

	public void setTotal(WebElement total) {
		this.total = total;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	
	

}
