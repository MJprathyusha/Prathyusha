$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Apple/eclipse-workspace/CucumberPrgms/src/test/resources/Features/New.feature");
formatter.feature({
  "name": "login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login scenario test for Gmail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "navigate to Gmail page",
  "keyword": "Given "
});
formatter.step({
  "name": "user logged in using username as �\u003cusername\u003e� and password as �\u003cpassword\u003e�",
  "keyword": "When "
});
formatter.step({
  "name": "home page should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "Password"
      ]
    },
    {
      "cells": [
        "DemoDemo@22@gmail.com",
        "DemoToday"
      ]
    },
    {
      "cells": [
        "unkonow@gmail.com",
        "New"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login scenario test for Gmail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "navigate to Gmail page",
  "keyword": "Given "
});
formatter.match({
  "location": "New.navigate_to_Gmail_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logged in using username as �\u003cusername\u003e� and password as �\u003cpassword\u003e�",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "home page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "New.verifySuccessful()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login scenario test for Gmail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "navigate to Gmail page",
  "keyword": "Given "
});
formatter.match({
  "location": "New.navigate_to_Gmail_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d89.0.4389.90)\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027DESKTOP-7C8LL06\u0027, ip: \u0027192.168.2.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002716\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.90, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\Apple\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53544}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 83a47f1f2b3de9c809f13c23d2c99161\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:324)\r\n\tat runner.New.navigate_to_Gmail_page(New.java:23)\r\n\tat ✽.navigate to Gmail page(file:/C:/Users/Apple/eclipse-workspace/CucumberPrgms/src/test/resources/Features/New.feature:4)\r\n",
  "status": "failed"
}));fformatter.step({
  "name": "user logged in using username as �\u003cusername\u003e� and password as �\u003cpassword\u003e�",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "home page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "New.verifySuccessful()"
});
formatter.result({
  "status": "skipped"
});
});