package com.codeborne.selenide.impl.commands;

import com.codeborne.selenide.Command;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementSource;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.impl.Events.events;

public class Append implements Command<WebElement> {
  @Override
  public WebElement execute(SelenideElement proxy, WebElementSource locator, Object[] args) {
    WebElement input = locator.getWebElement();
    input.sendKeys((String) args[0]);
    events.fireChangeEvent(input);
    return proxy;
  }
}
