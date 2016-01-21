#coding=utf-8
'''
Created on 2016年1月20日

@author: QLLU
'''
from appium import webdriver
import time

desired_caps = {}
desired_caps['platformName'] = 'Android'
desired_caps['platformVersion'] = '5.0.2'
desired_caps['deviceName'] = 'emulator-5554'
desired_caps['appPackage'] = 'com.cybozu.kunailite'
desired_caps['appActivity'] = '.ui.MainActivity'
desired_caps['autoLaunch'] = 'false'
driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)

def open():
	if driver.is_app_installed('com.cybozu.kunailite') is True:
		driver.launch_app()
		print "run"
		time.sleep(3)
	else:
		print "Please install apk."
def close():
	driver.quit()

def test_1():
	try:
		open()
		# 翻页3次，向左滑屏3次
		for i in range(3):
			driver.swipe(400, 400, 10, 400, 300)
			# driver.flick(400, 400, 0, 400)
			time.sleep(1)
		time.sleep(5)
	except Exception as e:
		print e
	finally:
		close()

test_1()









