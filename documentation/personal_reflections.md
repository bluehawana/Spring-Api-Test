# Inlämningsrapport

Information
OBS!!! Ändra absolut inte på rubrikerna i denna fil!!!!

## Inledning

### Vad handlar uppgiften om?
Denna uppgift handlar om att skapa jUnit-tester för en befintlig kod med API-anrop, på ett sätt som gör att testerna kan köras utan att de faktiskt anropar API:et. Jag har valt att skapa tester för en klass som hanterar API-anrop till en valideringstjänst för personnummer.

--- Skriv ovanför och ta inte bort denna raden ---

### Hur uppfattade du uppgiften initialt?
Jag uppfattade uppgiften som att jag skulle skapa tester för en befintlig kod, vilket jag tyckte lät som en intressant och lärorik uppgift. Jag läst på om jUnit och dess funktionalitet och kände mig redo att sätta igång sen började jag med att skapa en ny klass för att skapa tester för den befintliga koden.

--- Skriv ovanför och ta inte bort denna raden ---

## Planering och genomförande

### Hur planerade du att utveckla jUnit-testerna?
Jag planerade att börja med att skapa en ny klass för att skapa tester för den befintliga koden. Jag tänkte att jag skulle börja med att skapa en testmetod för varje metod i den befintliga koden. Jag tänkte att jag skulle använda mig av `@Before` för att skapa en instans av klassen jag ska testa och `@Test` för att skapa testmetoder för varje metod i klassen.
--- Skriv ovanför och ta inte bort denna raden ---

### Vilka steg tog du för att implementera jUnit-testerna?
Jag började med att skapa en ny klass för att skapa tester för den befintliga koden. Jag skapade en instans av klassen jag ska testa med `@Before` och skapade testmetoder för varje metod i klassen med `@Test`. Jag använde mig av `assertEquals` för att jämföra förväntat värde med det faktiska värdet.

--- Skriv ovanför och ta inte bort denna raden ---

## Utmaningar och lösningar

### Vilka utmaningar stötte du på under projektet?
Jag stötte på utmaningar när jag skulle skapa tester för metoder som anropade API:et. Jag hade svårt att förstå hur jag skulle göra för att testa dessa metoder utan att de faktiskt anropade API:et. Jag hade också svårt att förstå hur jag skulle göra för att testa metoder som returnerade olika värden beroende på vilket värde de fick in. Det fanns många problem med seed och pom fil som jag inte kunde lösa.
--- Skriv ovanför och ta inte bort denna raden ---

### Hur löste du dessa utmaningar?
Jag frågade Marcus och ChatGpt för att få hjälp med att lösa problemen. Jag fick hjälp med att skapa en instans av klassen jag ska testa med `@Before` och skapade testmetoder för varje metod i klassen med `@Test`. Jag använde mig av `assertEquals` för att jämföra förväntat värde med det faktiska värdet. Jag fick också hjälp med att skapa en instans av klassen jag ska testa med `@Before` och skapade testmetoder för varje metod i klassen med `@Test`. Jag använde mig av `assertEquals` för att jämföra förväntat värde med det faktiska värdet.

--- Skriv ovanför och ta inte bort denna raden ---

## Reflektion och utvärdering

### Vad lärde du dig genom att genomföra projektet?
Jag lärde mig mycket om jUnit och dess funktionalitet. Jag lärde mig också mycket med hur kan man lösa problem med seed och pom fil. Jag lärde mig också mycket. Jag lärde mig också mycket med mock testing och hur man skapar tester för metoder som anropar API:et, och hur man debuggar tester steg med steg.

--- Skriv ovanför och ta inte bort denna raden ---

### Vilka möjligheter ser du för framtida projekt baserat på denna erfarenhet?
Jag ser möjligheter att använda jUnit för att skapa tester för andra befintliga koder. Jag ser också möjligheter att använda jUnit för att skapa tester för metoder som anropar API:et, och många andra metoder som jag inte har testat än. Från denna uppgift har jag lärt mig mycket om jUnit och dess funktionalitet, och jag ser möjligheter att använda jUnit för att skapa tester för andra befintliga koder och metoder. Jag ser också möjligheter att använda jUnit för att skapa tester för metoder som anropar API:et, och många andra metoder som jag inte har testat än.

--- Skriv ovanför och ta inte bort denna raden ---
