## <center> Hangman console game </center>
<a name="readme-top"></a>

---

##### <center> Данный репозиторий является реализацией первого учебного проекта из курса [Java Backend Learning](https://zhukovsd.github.io/java-backend-learning-course/). </center>
---
### Навигация:
[1. Описание](#descriptiption)  
[2. Технологии](#tech)  
[3. Быстрый старт](#start)   
[4. Взаимодействие с приложением](#use)  
[5. Автор проекта](#author)

---
<a name="descriptiption"></a> 
### Описание:
Проект является разминочным, его основная цель – написать консольную реализацию игры «Виселица» (также «Балда»).  
Более подробное техническое задание можно найти [ТУТ](https://zhukovsd.github.io/java-backend-learning-course/Projects/Hangman/).

---
<a name="tech"></a> 
### Технологии:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

---
<a name="start"></a> 
### Быстрый старт:

1. Клонируйте репозиторий:  
   `git clone https://github.com/grishuchkov/Hangman-game.git`

2. Для сборки проекта используйте стандартную команду: `gradle clean build`. 
3. Это создает `Hangman-1.0-SNAPSHOT.jar` в каталоге `build/libs`, приложение теперь доступно для запуска с использованием `java -jar Hangman-1.0-SNAPSHOT.jar`. Командная строка должна находиться в директории `build/libs`.

4. Также приложение можно запустить и через IDE.
<p align="right">(<a href="#readme-top">↑ Наверх</a>)</p>

---
<a name="use"></a> 
### Взаимодействие с приложением:

При запуске игры вас встретит меню.  
При вводе в консоль `"Стоп"` – приложение закроется. При вводе `"Старт"` – начинается игра.  
Случайным образом загадывается слово, а игрок начинает процесс по его отгадыванию: пытается угадать буквы в слове, вводя их на клавиатуре.

Игра заканчивается либо при достижении игроком максимального количества ошибок – 6, либо при отгадывании слова. Затем снова открывается меню с выбором: `"Стоп"` или `"Старт"`.

<p align="right">(<a href="#readme-top">↑ Наверх</a>)</p>

---
<a name="author"></a> 
### Автор проекта:  [Grishuchkov Danila](https://github.com/grishuchkov)  


---
