package pages;

import manager.dto.StudentDTO;
import manager.enumps.Gender;
import manager.enumps.Hobbies;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;


import static manager.enumps.Hobbies.MUSIC;

public class AutomationPracticeForm extends BasePage {
    public AutomationPracticeForm(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory
                (driver, 10), this);
    }

    @FindBy(id = "firstName")
    WebElement fieldName;

    @FindBy(id = "lastName")
    WebElement fieldLastName;
    @FindBy(xpath = "//*[@placeholder='name@example.com']")
    WebElement fieldEmail;
    @FindBy(id = "userNumber")
    WebElement fieldMobileNumber;
    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    WebElement fieldDate0fBirth; //18 Jun 2019
//div[@class="subjects-auto-complete__input"]

    @FindBy (id = "subjectsInput")
    WebElement fieldSabject;
    @FindBy(xpath = " //input[@id='uploadPicture']")
WebElement selectPicture;
    @FindBy(id="currentAddress")
    WebElement fieldCurrentAddress;
    @FindBy(id="#react-select-3-input")
    WebElement fieldState;
    @FindBy(id="#react-select-4-input")
    WebElement fieldCity;
    @FindBy(xpath = "//button[text()='Submit']")
    WebElement btnSubmit;
    @FindBy(id="example-modal-sizes-title-lg")
    WebElement texThenkseFor;


    public AutomationPracticeForm fillStudentsform(StudentDTO studentDto) {
      //  hideFooter();
        fieldName.sendKeys(studentDto.getName());
        fieldLastName.sendKeys(studentDto.getLastName());
        fieldEmail.sendKeys(studentDto.getEmail());
        clickGender(studentDto.getGender());
        fieldMobileNumber.sendKeys(studentDto.getMobile());



//fieldDate0fBirth.clear();
//fieldDate0fBirth.sendKeys(studentDto.getDateOfBirth());
        typeFieldDateOfBirth(studentDto.getDateOfBirth());
        typeFieldSubjects(studentDto.getSubject());
        typeHobbies(studentDto.getHobbies());
        //"Mostovoy2023-8.jpg")
        //selectPicture.sendKeys();
        fieldCurrentAddress.sendKeys(studentDto.getCurrentAddress());
        //================================
        fieldState.sendKeys(studentDto.getState());
        fieldState.sendKeys (Keys.ENTER);
        fieldCity.sendKeys(studentDto.getCity());
        fieldState.sendKeys (Keys.ENTER);
        return this;

    }

    public AutomationPracticeForm clickBtnSubmit(){
        btnSubmit.click();
        return this;
    }
//    private void typeHobbies (List<Hobbies> hobbies) {
//
//
//        for (Hobbies h : hobbies) {
//            switch (h) {
//                case MUSIC:
//                    driver.findElement(By.cssSelector(h.getLocator())).click();
//                    break;
//                case SPORTS:
//                   driver.findElement(By.cssSelector(h.getLocator())).click();
//                   break;
//                case READING:
//                    driver.findElement(By.cssSelector(h.getLocator())).click();
//                    break;
//            }
//        }
//
//    }

    private void typeHobbies(List<Hobbies> hobbies) {
        for (Hobbies h : hobbies) {
            switch (h) {
                case MUSIC:
                    driver.findElement(By.cssSelector(h.getLocator())).click();
                    break;
                case SPORTS:
                    driver.findElement(By.cssSelector(h.getLocator())).click();
                    break;
                case READING:
                    driver.findElement(By.cssSelector(h.getLocator())).click();
                    break;

            }
        }

    }


    private void typeFieldSubjects(String subject) {
        //"Math,Pysics,Economics"
        fieldSabject.click();
        String[]splitArray=subject.split(", ");//["Math"]["Pysics"]["Economics"]

       for (String s:splitArray){
           fieldSabject.sendKeys(s);
           fieldSabject.sendKeys(Keys.ENTER);
       }
    }


    private void typeFieldDateOfBirth(String dateOfBirth) {
        String operationSystem = System.getProperty("os.name");
       fieldDate0fBirth.click();

        if (operationSystem.startsWith("Win"))
            fieldDate0fBirth.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        else if (operationSystem.startsWith("Mac"))
            fieldDate0fBirth.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        fieldDate0fBirth.sendKeys(dateOfBirth);
        fieldDate0fBirth.sendKeys(Keys.ENTER);
    }

    public void clickGender(Gender gender) {
        WebElement elementGender = driver.findElement(By.xpath(gender.getLocator()));
        elementGender.click();
    }


    public boolean isTextToBePresent_textThenksFor() {
        return super.isTextToBePresent(texThenkseFor, "Thanks for submitting the form",5);
    }

}
