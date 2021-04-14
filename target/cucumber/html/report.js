$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/features/trip/SearchFightstwo.feature");
formatter.feature({
  "line": 2,
  "name": "Make My Trip",
  "description": "",
  "id": "make-my-trip",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@searchtwo"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Serarch Flights",
  "description": "",
  "id": "make-my-trip;serarch-flights",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user at Make My trip portal",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user hover on \"More\" and print all the items",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user select \"Deals\" from the drop down",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user select from as \"Bengaluru\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user select to as \"Hyderabad\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user select a date",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user List the total number of flights available for that date",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFlightTwo.user_at_Make_My_trip_portal()"
});
formatter.result({
  "duration": 6718515564,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "More",
      "offset": 15
    }
  ],
  "location": "SearchFlightTwo.user_hover_on_and_print_all_the_items(String)"
});
formatter.result({
  "duration": 222700594,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deals",
      "offset": 13
    }
  ],
  "location": "SearchFlightTwo.user_select_from_the_drop_down(String)"
});
formatter.result({
  "duration": 175063559,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element is not clickable at point (377, 1961)\n  (Session info: chrome\u003d89.0.4389.114)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.10586 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-MV18312\u0027, ip: \u0027192.168.1.123\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578737 (49da6702b16031..., userDataDir: C:\\Users\\User\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:64127}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 89.0.4389.114, webStorageEnabled: true}\nSession ID: 8054582b694d723861a739d30639abf2\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat com.steps.flight.SearchFlightTwo.user_select_from_the_drop_down(SearchFlightTwo.java:77)\r\n\tat ✽.And user select \"Deals\" from the drop down(com/features/trip/SearchFightstwo.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 21
    }
  ],
  "location": "SearchFlightTwo.user_select_from_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hyderabad",
      "offset": 19
    }
  ],
  "location": "SearchFlightTwo.user_select_to_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchFlightTwo.user_select_a_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchFlightTwo.user_List_the_total_number_of_flights_available_for_that_date()"
});
formatter.result({
  "status": "skipped"
});
});