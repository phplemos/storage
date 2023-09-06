from selenium import webdriver
from time import sleep

options = webdriver.ChromeOptions()

driver = webdriver.Chrome()

driver.get("https://phplemos-dev.notion.site/UESB-Sistemas-de-Informa-o-07689c37ce354a80b741414bda234021?pvs=4")
sleep(5)
driver.get_screenshot_as_file("rotina.png")

driver.quit()
