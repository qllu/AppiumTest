#coding=utf-8
'''
Created on 2016年1月20日

@author: QLLU
'''
import time
import unittest
from selenium.webdriver.common.by import By
from appium import webdriver


class kunai_test(unittest.TestCase):

	@classmethod
	def setUpClass(self):
		global DR
		desired_caps = {}
		desired_caps['platformName'] = 'Android'
		desired_caps['platformVersion'] = '5.0.2'
		desired_caps['deviceName'] = 'emulator-5554'
		desired_caps['appPackage'] = 'com.cybozu.kunailite'
		desired_caps['appActivity'] = '.ui.MainActivity'
		desired_caps['autoLaunch'] = 'false'
		self.driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)
		DR = self.driver
		if DR.is_app_installed('com.cybozu.kunailite') is True:
			DR.launch_app()
			print "run"
			time.sleep(3)
		else:
			print "Please install apk."

		# self.accept_next_alert = True

	@classmethod
	def tearDownClass(self):
		DR.quit()

	# def close_alert_and_get_its_text(self):
	# 	try:
	# 		alert = DR.switch_to_alert()
	# 		alert_text = alert.text
	# 		if self.accept_next_alert:
	# 			alert.accept()
	# 		else:
	# 			alert.dismiss()
	# 		return alert_text
	# 	finally:
	# 		self.accept_next_alert = True

	def mtest_1(self):
		try:
			# 翻页3次，向左滑屏3次
			for i in range(3):
				DR.swipe(500, 600, 10, 600, 200)
				# driver.flick(400, 400, 0, 400)
				time.sleep(1)
			time.sleep(5)
		except Exception as e:
			print e

	def mtest_2(self):
		try:
			# 向上滑动
			DR.swipe(200, 700, 200, 200, 300)
			# driver.flick(400, 400, 0, 400)
			time.sleep(5)
		except Exception as e:
			print e

	def test_3(self):
		DR.find_element(By.XPATH, "//*[@text='New']").click()
		DR.find_element(By.ID, "com.cybozu.kunailite:id/sc_schedule_title").send_keys("hello")
		DR.find_element(By.ID, "com.cybozu.kunailite:id/confirm_bar_ok").click()
		time.sleep(3)



if __name__ == "main":
	unittest.main()










