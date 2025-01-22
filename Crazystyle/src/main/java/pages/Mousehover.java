package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Baseclass;

public class Mousehover extends Baseclass {

	

	public Mousehover(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[contains(@class,'main-menu main-menu-padding-1 main-menu-lh-2 d-none d-lg-block font-heading')]//a[normalize-space()='Product']")
	WebElement Productmenu;

	@FindBy(xpath = "/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[5]/a")
	WebElement Accessoriesmenu;

	@FindBy(xpath = "/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[6]/a")
	WebElement EAccessoriesmenu;

// women category menu section
	@FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Women']")
	WebElement womensubmenu;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Traditional Wear']")
	WebElement Traditionalwear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Lehanga Choli']")
	WebElement Lehangacholi;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Maxi Dress']")
	WebElement Maxidress;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Sarees']")
	WebElement Sarees;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Ethnic Wear']")
	WebElement Ethnicwear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Kurtas And Salwar']")
	WebElement KurtasAndSalwar;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Dress Materials']")
	WebElement DressMaterial;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Tops and Tunics']")
	WebElement TopsandTunics;

	// Bottom wear
	@FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Bottom Wear']")
	WebElement bottomwearsubmenu;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Leggins']")
	WebElement Leggins;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Jeans']")
	WebElement Jeans;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Skirts']")
	WebElement Skirts;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Track Pants']")
	WebElement TrackPants;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Palazzo']")
	WebElement Palazzo;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Shorts']")
	WebElement Shorts;

	// western wear
	@FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Western Wear']")
	WebElement westernwearsubmenu;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Jumpsuits']")
	WebElement Jumpsuits;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Shrugs and Jackets']")
	WebElement ShrugsAndJackets;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Dress - One Piece']")
	WebElement DressOnePiece;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='T-shirts and Tops']")
	WebElement TShirt;

	// maternity wear
	@FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Maternity Wear']")
	WebElement maternitywearsubmenu;

	// women inner wear
	@FindBy(xpath = "/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[4]/ul/li[5]/a")
	WebElement womeninnerwearsubmenu;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Bra']")
	WebElement Bra;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Sleepwear']")
	WebElement Sleepwear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Thermals and Camisoles']")
	WebElement ThermalsAndCamisoles;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Briefs']")
	WebElement Briefs;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Sports Wear']")
	WebElement SportsWear;

	// mens wear
	@FindBy(xpath = "/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[4]/ul/li[6]/a")
	WebElement menswearsubmenu;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Top Wear']")
	WebElement MenTopWear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Formal & Casual shirt']")
	WebElement FormalCasualshirt;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men T-shirt']")
	WebElement MenTshirt;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Suits']")
	WebElement Suits;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Trendywear']")
	WebElement Trendywear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Blazzers and Coats']")
	WebElement BlazzersAndCoats;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Hoodies']")
	WebElement Hoodies;

	// mens traditional wear
	@FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Men Traditional Wear']")
	WebElement MenTraditionalWear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Kurtas and Sherwanis']")
	WebElement KurtasandSherwanis;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Vesti and Dhotis']")
	WebElement VestiandDhotis;

	// mens western wear

	@FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Men Western Wear']")
	WebElement MenWesternWear;

	@FindBy(xpath = "/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[4]/ul/li[8]/ul/li[1]/a")
	WebElement menwwsub1menu;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Jeans']")
	WebElement MenJeans;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Trousers']")
	WebElement MenTrousers;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Sport Wear']")
	WebElement MenSportWear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Shorts']")
	WebElement MenShorts;

	// mens inner wear
	@FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Men Inners']")
	WebElement MenInners;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Vest']")
	WebElement Vest;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Sleepwear']")
	WebElement MenSleepwear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Briefs']")
	WebElement MenBriefs;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Swimwear']")
	WebElement Swimwear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Sportswear']")
	WebElement MenSportswear;

	// accessories
	@FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Women Accessories']")
	WebElement WomenAccessories;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Footwear']")
	WebElement Footwear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Sports Accessories']")
	WebElement SportsAccessories;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Makeup']")
	WebElement Makeup;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Skincare']")
	WebElement Skincare;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Lipsticks and Lip Gloss']")
	WebElement LipsticksandLipGloss;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Frangances']")
	WebElement Frangances;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Gadgets']")
	WebElement Gadgets;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Travel and Casual Bags']")
	WebElement TravelandCasualBags;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Handbags and Wallets']")
	WebElement HandbagsandWallets;

	// men accessories
	@FindBy(xpath = "/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[5]/ul/li[2]/a")
	WebElement menacsubmenu;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Wallets']")
	WebElement MenWallets;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Belts']")
	WebElement Belts;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Ties, Cufflinks & Pocket Squares']")
	WebElement TiesCufflinksPocketSquares;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Caps & Hats']")
	WebElement CapsHats;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Mufflers, Scarves & Gloves']")
	WebElement MufflersScarvesGloves;

	@FindBy(xpath = "/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[5]/ul/li[2]/ul/li[6]/a")
	WebElement menacsub6menu;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Perfumes & Body Mists']")
	WebElement PerfumesBodyMists;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Skincare']")
	WebElement MenSkincare;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Rings & Wristwear']")
	WebElement RingsWristwear;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Sunglasses']")
	WebElement Sunglasses;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Watches']")
	WebElement Watches;

	// electronic accessories
	@FindBy(xpath = "//ul[contains(@class,'sub-menu')]//a[normalize-space()='Electric and Appliances']")
	WebElement ElectricandAppliances;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Electronics']")
	WebElement Electronics;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Computer Accessories']")
	WebElement ComputerAccessories;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Home Decor and Appliances']")
	WebElement HomeDecorandAppliances;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Cellphones and Tabs']")
	WebElement CellphonesandTabs;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Home and Kitchen']")
	WebElement HomeandKitchen;

	@FindBy(xpath = "//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Cameras']")
	WebElement Cameras;

	public void clickAndHover(WebElement main1, WebElement main2, WebElement main3, WebElement main4) {
		Actions act = new Actions(driver);
		act.moveToElement(wait.until(ExpectedConditions.visibilityOf(Productmenu))).perform();
		act.moveToElement(wait.until(ExpectedConditions.visibilityOf(womensubmenu))).perform();
		act.moveToElement(wait.until(ExpectedConditions.visibilityOf(Traditionalwear))).perform();
		wait.until(ExpectedConditions.visibilityOf(Lehangacholi)).click();

	}
	
	
	public void mousehoverwomens()
	{
		clickAndHover(Productmenu, womensubmenu, Traditionalwear, Lehangacholi);
	}

}
