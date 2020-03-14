import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TableAutomation {
    /*
        HTML table structure
        An HTML table is defined with the <table> tag.

        Each table row is defined with the <tr> tag. A table header is defined with the <th> tag.
        By default, table headings are bold and centered. A table data/cell is defined with the <td> tag.

        <table style="width:100%">
            <tr>
                <th>Car</th>
                 <th>Color</th>
                 <th>Year</th>
            </tr>
            <tr>
                <td>BMW</td>
                <td>Red</td>
                <td>2020</td>
            </tr>
            <tr>
                <td>Tesla</td>
                <td>Black</td>
                <td>2019</td>
            </tr>
         </table>
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseURL = "http://demo.guru99.com/test/web-table-element.php";

        // Navigate to google
        driver.get(baseURL);

        List cols = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th"));

        //*[@id="leftcontainer"]/table/thead/tr/th[1]
        // Get col size System.out.println("No of rows are : " + rows.size());

        WebElement firstCol = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th[1]"));

//        System.out.println("First col value: " + firstCol.getText());

//        int age = 21;
//        String sentense = "I am" + age +  "years old";

        // xpath for cols //table[@class="dataTable"]/thead/tr/th

        //Get table headers
        for (int i = 1;i<cols.size();i++) {
            WebElement col = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th["+ i +"]"));
            System.out.print(" | " + col.getText() + " | ");
        }

        // Get specific value
        WebElement firstRowSecondColValue =  driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
        // System.out.println("First row and 2nd value " + firstRowSecondColValue.getText());

        //Get all first column values
        // Xpath for th col  //table[@class='dataTable']/tbody/tr[# of rows]/td[1]

        // Numer of rows
        List rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

//        System.out.println("All values of column - " + firstCol.getText());

//        System.out.println("*******");
        for(int i = 1; i <= rows.size(); i++){
            // Target the col
            WebElement firtRowValue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ i +"]/td[1]"));
//            System.out.println(firtRowValue.getText());
        }

        // Get all colum values of first row
        //xpath for first row columns - //table[@class="dataTable"]/tbody/tr[1]/td[]
        List columnSize = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td"));

//        System.out.println("Printing colums Of First Row *****");
        for(int i = 1; i <= columnSize.size(); i++){
            //Target colums of first row
            //pattern  "//table[@class=\"dataTable\"]/tbody/tr[1]/td[1]"
            WebElement columsOfFirstRow = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td["+i+"]"));
//          System.out.println(columsOfFirstRow.getText());
        }

        System.out.println(""); // to put line between thead and tbody
        // Target rows
        for(int i = 1; i <= rows.size(); i++){
            //Target columns within rows
            System.out.print(" | " );
            for(int j = 1; j <= columnSize.size(); j++){
                WebElement columsOfRows = driver.findElement(By.xpath("//table[@class='dataTable']/*/tr["+ i +"]/td["+j+"]"));
                System.out.print(" " + columsOfRows.getText() + " ");
            }
            System.out.print(" | " );
            System.out.println(" ");
        }
        // close browser
        driver.quit();
    }
}
