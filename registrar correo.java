
public class Prueba4Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void prueba4() {
    driver.findElement(By.cssSelector("<button class=\"IW9gNha7rl8v_c bxgKMAm3lq5BpA SdamsUKjxSBwGb PnEv2xIWy3eSui SEj5vUdI3VvxDc\" type=\"submit\" data-testid=\"moonshot-continue-button\">Cree su espacio de trabajo<span class=\"nch-icon A3PtEe1rGIm_yL J2CpPoHYfZ2U6i\"><span data-testid=\"MoveIcon\" aria-hidden=\"true\" class=\"css-snhnyn\" style=\"--icon-primary-color:light; --icon-secondary-color: inherit;\"><svg width=\"24\" height=\"24\" role=\"presentation\" focusable=\"false\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M12.292 4.29149C11.903 4.67949 11.903 5.31649 12.292 5.70549L17.586 10.9995H4C3.45 10.9995 3 11.4495 3 11.9995C3 12.5505 3.45 13.0005 4 13.0005H17.586L12.289 18.2965C11.9 18.6855 11.9 19.3215 12.289 19.7105C12.678 20.1005 13.315 20.1005 13.703 19.7105L20.702 12.7125C20.704 12.7115 20.706 12.7095 20.709 12.7075C20.903 12.5145 21 12.2565 21 11.9995C21 11.7425 20.903 11.4855 20.709 11.2915C20.706 11.2905 20.703 11.2885 20.701 11.2865L13.706 4.29149C13.512 4.09749 13.255 4.00049 12.999 4.00049C12.743 4.00049 12.486 4.09749 12.292 4.29149Z\" fill=\"currentColor\"></path></svg></span></span></button>")).click();
  }
}
