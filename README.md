> You can run this application with mvnw!!

> I recommend that you look at the source through the STS.

# 👋Oneul
Newlecture team project.
This is a modile website for a diary platform in which people can share diary and communicate with others

## 🌟using stack
- Spring boot 
- Thymeleaf
- Mybatis
- ES6


## Description
###  Oneul diary
평소 일기를 작성하거나 일기를 작성하려고 마음 먹은 사람들이 일기를 작성하고 관리하기 쉽도록 도와주는 일기작성 web application 입니다. 작성자는 일기작성시 제공되는 template을 통해 좀더 일기를 손쉽게 작성할수 있습니다. 일기의 공유범위를 설정해주면 다른 사람들이 익명으로된 나의 일기를 보고 댓글을 달수있습니다. 감정선택과 달력기능을 통해서 일기 관리와 그날의 나의 감정을 돌아보는 기능을 제공하고 있습니다.

**GitHub** <https://github.com/ohhyeonn/Oneul>

**Tech Skills** 
- Front-End
    - Thymeleaf
    - ES6 Ajax
- Back-End
    - SpringBoot / Mybatis / Linux / MySql

    
**Detail of function**
- 로그인 및 회원가입 - Spring security사용
- 알람 기능 - Spring email 라이브러리 사용
- 일기 CRUD - MyBatis 사용
- 로그인 기능 - Spring security Session 사용
- 이미지 업로딩 기능 - multipart data form 
- 무한 스크롤 기능 - ES6 Ajax fetch 사용
- Spring filter를 이용 전역 변수 관리
- 비동기 처리 - ES6 fetch function 사용
- CSS & HTMLtag으로 웹 디자인 구성
- 웹 보안 향상 - js를통한 front 제약조건 check
- MySql로 데이터 관리, MyBatis에서 DB와 object mapping
- Linux를통한 데이터 베이스 server 구현

**References**
- [기능상세설명서](https://docs.google.com/document/d/1zgSTGTxDVcRstSBKEhH7lA1RoxEAf-CM/edit?usp=sharing&ouid=111269475831579487274&rtpof=true&sd=true)
- [UseCase](https://docs.google.com/presentation/d/1l4LwXA_vd7xjrjfD6gNz3t8WMzE-CEid-ed3t1UhNXI/edit?usp=sharing)
- [Wireframe](https://docs.google.com/presentation/d/12YMREEBBJfBQFBjj6exUoRr_b-T8BZ9BTqSxpWRX7f0/edit?usp=sharing)
- [DB설계 (ERD)](https://docs.google.com/presentation/d/1A9wLIgtR2b00UO2CTQh06xQIWRgXjWTzOSNeeJXdpuI/edit?usp=sharing)
- [칸반보드](https://trello.com/b/GRiS3XmE/oneul-project)

**notice**
- Spring boot를 사용하여 생상성과 효율성을 최대한으로 활용하고자 하였습니다.
- Spring MVC를 활용하여 각 기능에 대한 분업의  효율성을 높였습니다.
- Mybatis를 활용하고 Xml을 직접 작성하여 Framework의 기능을 좀 더 세분화 하였습니다.
- RestApi를 구현하여 웹상에서 비동기를 활용한 데이터 모델을 구현하였습니다. 
- Jsp를 선택하지 않고 Thymeleaf를 선택하여 좀더 Spring boot에 맞는 Template기반의 View를 구현 하였습니다.

## Entity Relationship Diagram (ERD)

<img width="537" alt="erd" src="https://ohhyeonn.github.io/ohhyeonn/oneul-ERD.png">


## 실행 및 URL

### CMD로실행 또는 STS로실행

* cmd 이용
```cmd
> cd {~~\Oneul\OneulPrj}
> .\mvnw spring-boot:run
```

> 또는

* STS(eclipse) dev-tools 이용 run



### Access server side using following URL

```
http://localhost:8080
```

### Database server is alreay runing on Linux
```
http://hi.namoolab.com
```


## Author

👤 **Team newlecture : Oneul**

* It's a study group made by NEWLECTURE teacher
* [newlecture youtube](https://www.youtube.com/user/newlec1)

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check

## Show your support

Give a ⭐️ if this project helped you!

***
Thank you for reading ❤️ 
