# Inlämningsrapport

Information
OBS!!! Ändra absolut inte på rubrikerna i denna fil!!!!

## Inledning

### Beskriv kort uppgiften om att skapa och testa en mockad Java-klass.

Uppgiften var att skapa CRUD-metoder med ett interface och sedan använda mockito, att skapa falska objekt för att testa dessa metoder.
--- Skriv ovanför och ta inte bort denna raden ---

### Vilka var dina initiala tankar om användning av interfaces och mockning?

Jag hade faktiskt redan stött på mockito i en tidigare testuppgift där jag försökte mig på att skapa tester till en metod som tog input från användare. 
När jag undersökte hur sådanna tester skulle se ut läste jag lite om mockito, men det var överkurs för den uppgiften. Interfaces hade jag ingen störra förståelse för, men tänkte att det fungerar som en mall.

--- Skriv ovanför och ta inte bort denna raden ---

## Planering och genomförande

### Hur planerade du att utveckla och testa den mockade klassen?

Jag började med att göra metoderna och fundera på vad syftet med testerna var. Sedan började jag skapa testerna, det jag alltid behövöde utgå ifrån var vad syftet med metoderna är.

--- Skriv ovanför och ta inte bort denna raden ---

### Vilka steg tog du för att implementera och testa mockningen?

Skapa mock av PersonCrud-klassen som sedan skulle följa med i alla tester. Använde mig av en beforeeach för att inte skapa ny i varje test.
I vissa metoder krävde det att tex lägga till objekt i en lista. Sedan testa med mocken och avsluta med att verifiera att det faktiskt fungerar som tänkt.

--- Skriv ovanför och ta inte bort denna raden ---

## Utmaningar och lösningar

### Vilka var de största utmaningarna med mockning och enhetstester?

Jag trasslade ibland ihop exakt vad som skulle testas. Ibland fick jag rött i testerna och jag kunde lixom inte klura ut om det var metoden som var fel eller om jag skrivit fel i testet.

--- Skriv ovanför och ta inte bort denna raden ---

### Hur löste du problemen med att skapa och använda mockade objekt?

Eftersom att detta program inte har någon kod i main var det svårt ibland att avgöra vad som gått fel när testet inte fungerade. 
Men det underlättar att förstå vad ett test behöver göra steg för steg. Ge testet all information som behövs för att utföra testet, testa och kontrollera resultatet.

--- Skriv ovanför och ta inte bort denna raden ---

## Reflektion och utvärdering

### Reflektera över din inlärning gällande interfaces och mockning i Java.

Interfaces skulle jag vilja lära mig mer om, när exakt i verkliga situationer används de, hur pass viktiga är de? Här upplevde jag inte att de riktigt gjorde något.
Mockito hade jag som sagt stött på tidigare och att få lära mig om det svarade på frågor jag haft med mig från tidigare uppgifter.

--- Skriv ovanför och ta inte bort denna raden ---

### Hur kan du förbättra dina färdigheter i mockning och enhetstester framöver?

Jag skulle vilja göra något test där vi använder mockito för att testa metoder som skulle kräva användar-input.
De metoderna behöver ju också testas, så det känns som en naturlig vidareutveckling på denna uppgift.

--- Skriv ovanför och ta inte bort denna raden ---
