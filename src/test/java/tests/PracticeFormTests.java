package tests;

import manager.ApplicationManager;
import manager.dto.StudentDTO;
import manager.enumps.Gender;
import manager.enumps.Hobbies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests extends ApplicationManager {

    SoftAssert softAssert=new SoftAssert();
    @Test
    public void practiceFormPositiveTest(){
        List<Hobbies> listHobbies=new ArrayList<>();
        listHobbies.add(Hobbies.SPORTS);
        listHobbies.add(Hobbies.MUSIC);
StudentDTO student=new StudentDTO( "Steve", "Silver","silver123@gmail.com"
        , Gender.OTHER,"1234567890",  "12 Sep 1900",  "Math, Physics, Economics",
        listHobbies,  "",  "Haifa st 1 app 2",  "NCR",  "Delhi");




//        StudentDTO student=new StudentDTO();
//        student.setName("Stive");
//        student.setLastName("Silver");
//        student.setEmail("Silver1234@gmail.com");
//        student.setGender(Gender.MALE);


        new HomePage(getDriver())
                .clickbtnForm()
                .clickbtnPracticeForm()
                .fillStudentsform(student)
                ;


        WebElement elementNameFamily = getDriver().findElement(By.xpath("//tbody/tr[1]/td[last()]"));
        softAssert.assertEquals(elementNameFamily.getText(),"Steve Silver");

        WebElement elementEmail = getDriver().findElement(By.xpath("//tbody/tr[2]/td[last()]"));
        softAssert.assertEquals(elementEmail.getText(),"silver123@gmail.com");

        //softAssert.assertTrue();
        softAssert.assertAll();

    }


}
