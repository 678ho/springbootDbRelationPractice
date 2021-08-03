# SpringbootDataBasePractice
![testRead](https://user-images.githubusercontent.com/43158428/127994828-fd296253-33ba-41a3-a0fb-3f0888ed6c7d.PNG)
![testGetBoardWithReply](https://user-images.githubusercontent.com/43158428/127994860-08452750-436e-454d-8621-9018c09cc52a.PNG)
![testRead2](https://user-images.githubusercontent.com/43158428/127994947-8f9baa23-4476-4ff1-9cf5-558e2feb76b2.PNG)
![testread3](https://user-images.githubusercontent.com/43158428/127994988-38efc328-711d-463e-ba82-01f9448efa2f.PNG)
![testReadWithWriter](https://user-images.githubusercontent.com/43158428/127995001-7e9c502e-ee0c-4683-9cf8-e0cef2f7a637.PNG)
![testRegister](https://user-images.githubusercontent.com/43158428/127995011-939bacfa-9c79-4fd0-8fbb-3056d9a47271.PNG)
![testReply](https://user-images.githubusercontent.com/43158428/127995016-a3d51220-e831-4bc0-953d-e63f1f1cfa16.PNG)
![testWithReplyCount](https://user-images.githubusercontent.com/43158428/127995018-a457a0d2-968e-4697-ba6b-34814f72afae.PNG)

Database N:1 relation

## Getting Started / 어떻게 시작하나요?

이 곳에서 설치에 관련된 이야기를 해주시면 좋습니다.

### Prerequisites / 선행 조건

아래 사항들이 설치가 되어있어야합니다.

```
Intellij or VSCode or STS ( IDE )
Lombok, Spring Boot DevTools, Spring Web, Thymeleaf, Spring Data JPA ( Modules )
```


### 테스트는 이런 식으로 동작합니다


```
TestInsert()는 한명의 사용자가 하나의 게시물을 등록하도록 작성. (테스트 결과는 DB를 통해서 확인)
ReplyRepositoryTest클래스를 통해 임의의 게시글을 대상으로 댓글 추가.
insertReply()는 300개의 댓글을 1~100사이 번호로 추가함.
testRead1() 메서드를 실행하면 쿼리가 내부적으로 left outer join 처리 된것을 확인할수있음.
Reply, Board @ManyToOne 관계이므로 테스트를 하면서 자동으로 조인이 처리됨.
```

### 테스트는 이런 식으로 작성하시면 됩니다

```
test폴더 내에 테스트 패키지를 생성하고 테스트 코드를 추가 작성.
```



## License / 라이센스

This project is licensed under the MIT License - see the [LICENSE.md](https://gist.github.com/PurpleBooth/LICENSE.md) file for details / 이 프로젝트는 MIT 라이센스로 라이센스가 부여되어 있습니다. 자세한 내용은 LICENSE.md 파일을 참고하세요.

