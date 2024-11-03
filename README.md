# Piotr Stanik, Color Library
 Projekt końcowy 
## Funkcjonalności aplikacji:
    Bazę danych z podstawowymi kolorami farb na podstawie, których użytkownik dodaje swoje farby


 Ideą aplikacji jest przedstawienie posiadanych farb w tabeli, ma to ułatwić identyfikację braków potrzebnych farb




# BackEnd
Technologie:
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

# FrontEnd
 Technologie

- Html
- Css
- TypeScript
- Angular 17.1.4
  - Prettier
  - Tailwind
  
 ## Wymagania
 - Angular 17.1.4 lub nowszy

 ## Uruchomienie
    Aby uruchomić aplikację należy sklonować repozytoria: 
    - https://github.com/pstanN1267/ColorLibrary 
    - https://github.com/pstanN1267/colorLibrary-front
    
## Działanie
Przed uruchomieniem aplikacji należy wykonąc instrukcje w db_template.properties

Po uruchomieniu wchodzimy na http://localhost:4200

![image](https://github.com/user-attachments/assets/3ca7e0c8-099a-44a5-8156-b438657a2ac4)

Gdzie możemy kliknąć w "Add Paints" lub "Library"

# Add Paints

![image](https://github.com/user-attachments/assets/caa6da94-c891-4b9a-8f88-048a8e781c61)

Back - cofa nas do ekranu startowego
Library - przenosi do zakładki Library
Add paint - umożliwia dodanie farbki

Przykładowe dane:
- Citadel Base Abaddon Black
- Citadel Layer Calgar Blue
- Citadel Base Averland Sunset
- Citadel Base Bugmans Glow
- Citadel Base Caledor Sky
- Citadel Technical Waystone Green

**!!!!WAŻNE** W razie jakichkolwiek błędów (literówka, spacja)  wyskoczy czerowny komunikat **Failed to add paint. Please try again.!!!!**


Tak powinna wyglądać tabela kolorów po poprawny dodaniu farbek
Po najechaniu na kolor wyświetla nam się color hex 
Mamy możliwość usunięcia dodanej farbki Xsem z prawej strony
![image](https://github.com/user-attachments/assets/efc71615-4982-4ed7-9d07-dd64b86d77d2)


# Library

Tutaj mamy tabelę ze wszystkimi dostępnymi farbami

![image](https://github.com/user-attachments/assets/b23dbebc-e31a-4ebb-ae14-82bce25a98de)
