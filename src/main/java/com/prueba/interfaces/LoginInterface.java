package com.prueba.interfaces;

import org.openqa.selenium.By;

public class LoginInterface {

    public static By txtUsername = By.cssSelector("#user-name");
    public static By txtPassword = By.id("password");
    public static By btnLogin = By.id("login-button");
}
