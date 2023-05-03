package testscript;

public class LoginScript 
{
String un = Fetch_data.get_data("Sheet1",0,0);
String pwd = Fetch_data.get_data("Sheet1",0,1);
Pom p=new Pom(driver);
p.username(un);
p.password(pwd);
p.login_btn();
}
