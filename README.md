# Backend aplikacji ColorLibrary

Aplikacja posiada pełną komunikację miedzy bazą danych H2, a aplikacją. Można to sprawdzić za pomocą SwaggerUI w który aplikacja została wyposażona

## Technologie

- Java 17
- Spring Boot 3.3.2
  - Spring Data JPA
  - Spring Web
  - H2 Database
  - JDBC API
  - Spring Boot Actuator
  - Spring Boot DevTools
 ## Wymagania
 - Java 17 lub nowszą
 - Apache Maven 3.x

    Aby uruchomić aplikację należy sklonować repozytorium pod adresem https://github.com/pstanN1267/ColorLibrary
## Działanie
Przed uruchomieniem aplikacji należy wykonąc instrukcje w db_template.properties

Następnie wchodzimy na stronę http://localhost:8080/swagger-ui/index.html#/user-paints-controller/copyRow gdzie możemy dodawać, usuwać, oraz listować tabele UserPaints oraz Stock Paints


   ## Dodawanie farbek
-  odbywa się za pomocą controllera metodą **Post**
-  Klikamy ![tryItOut](https://github.com/user-attachments/assets/e0724a90-5d37-4124-b437-a50817158357)
-  Wpisujemy brand: Citadel, range: Base, name: Abaddon Black, lub inną pozycję która znajduje się w pliku StockColors.CSV i klikamy **Execute**
  ![post](https://github.com/user-attachments/assets/22360e68-4255-41d8-8d75-c8a2c46387e9)
- Dostajemy odpowiedź:
    -  z kodem 200 jeśli farbka została dodana to tabeli UserPaints
       lub
    -   kod 500 z komunikatem "Paint not found" w przypadku nazwy nie występującej w tabeli StockPaints lub  komunikat "Paint already added.", jeśli duplikujemy wiersz

## Listowanie
- Przechodzimy do metody **Get**
- Analogicznie klikamy Try It out, a następnie Execute
 ![get](https://github.com/user-attachments/assets/200a191f-6984-4a85-9adf-a625d177f58b)
- Otrzymujemy odpowiedź
  ![image](https://github.com/user-attachments/assets/5c156669-9671-4bc5-9308-a2859462b59d)


## Usuwanie farbek
- Przechodzimy do metody **Delete**
- Klikamy Try it Out, następnie Wpisujemy Id, które uzyskujemy z listowania oraz Execute
![image](https://github.com/user-attachments/assets/5763dbd0-41ee-45db-b8d8-04bec395a957)
- Otrzymujemy odpowiedź z kodem 200, nawet jeśli wpiszemy nie istniejące Id.
- Dla sprawdzenia listujemy ponownie, gdzie farbka, która dodaliśmy wcześniej została usunięta


## Listowanie zbioru farbek bazowych
- Przechodzimy do stock-paints-controller
- W metodzie **Get** klikamy "Try it out"
  ![image](https://github.com/user-attachments/assets/166efa1d-b398-4e66-8996-4534eb65ef27)
- Otrzymujemy w odpowiedzi listę dostępnych farbek
  
![image](https://github.com/user-attachments/assets/c328650a-ac6a-48ba-afad-a9103d1dd37f)


Repozytorium niedokończonego FrontEndu znajduje się pod adresem https://github.com/pstanN1267/colorLibrary-front
