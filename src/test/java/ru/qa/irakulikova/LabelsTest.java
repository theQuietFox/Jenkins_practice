package ru.qa.irakulikova;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    @Test
    @Feature("Форма регистрации студента")
    @Story("Заполнение формы регистрации")
    @Owner("ru.qa.irakulikova")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Testing Form", url = "https://demoqa.com/automation-practice-form")
    @DisplayName("Заполняем форму регистрации сгенерированными данными")
    public void testStaticLabels() {
    }
}