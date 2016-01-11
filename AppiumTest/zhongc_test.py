from appium import webdriver

desired_caps = {}
desired_caps['platformName'] = 'Android'
desired_caps['platformVersion'] = '4.3'
desired_caps['deviceName'] = 'emulator-5554'
desired_caps['appPackage'] = 'com.subject.zhongchou'
desired_caps['appActivity'] = 'com.subject.zhongchou.activity.SplashActivity'

driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)
driver.quit()
