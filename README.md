# Проект по автматизации тестовых сценариев для [Т_Банка](https://www.tbank.ru/)

<img src="images/Main.png" width="900">

## <img src="images\book.jpg" title="Jenkins" width="5%"/>Содержание

* <a href="#tests">Использованный стек технологий</a>
* <a href="#tests">Что прверяют тесты</a>
* <a href="#jenkins">Jenkins</a>
* <a href="#allure">Отчет в Allure</a>
* <a href="#telegramBot">Уведомления в Telegram bot</a>
* <a href="#video">Видео прохождения тестов</a>

---

## <a name="Использованный стек технологий">**Использованный стек технологий**</a>

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure_Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">

</p>

---

<a id="tests"></a>
## <a name="Что проверяют тесты?">**Что проверяют тесты?**</a>

Я написал 5 автотестов, для провверки функционала на главной странице [сайта.](https://www.tbank.ru/)

---

<a id="tools"></a>
## <img src="images/logo/Jenkins.svg" title="Jenkins" width="5%"/> <a name="Jenkins:">**Jenkins:**</a>

Ссылка на закпуск в [Jenkins](https://jenkins.autotests.cloud/job/at_tbank_hw_14/)

<p align="center">
<img title="Jenkins Build" src="images\Jenkins.png">
</p>

Для запуска тестов необходимо нажать на кнопку "Build Now". Появится прогресс бар с номером сборки тестов.

---

<a id="allure"></a>
## <img src="images/logo/Allure_Report.svg" title="Jenkins" width="5%"/><a name="Отчет в Allure">**Отчет в Allure**</a>

Ссылка на отче в [Allure Report](https://jenkins.autotests.cloud/job/at_tbank_hw_14/allure/)
### На скриншоте результаты отчета пяти тестов:
<p align="center">
<img title="Allure Overview" src="images/Allure.png">
</p>

### Результат выполнения теста

<p align="center">
<img title="Test Results in Alure" src="images\Allure2.png">
</p>
---

<a id="telegramBot"></a>
## <img src="images/logo/Telegram.svg" title="Jenkins" width="7%"/><a name="Уведомления в Telegram bot">**Уведомления в Telegram bot**</a>

Для быстрой визуализации отчетности, после выполнения тестов, результат отчета дублируется в Telegram бот:
<p align="center">
<img width="70%" title="Telegram Notifications" src="images\Telegramm.png">
</p>

---

<a id="video"></a>
## <a name="Видео прохождения тестов">**Видео прохождения тестов**</a>

<p align="center">
  <img title="Selenoid Video" src="images/video.gif">
</p>