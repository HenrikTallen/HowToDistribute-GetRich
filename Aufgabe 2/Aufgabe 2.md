# Aufgabe 2

## Ziel der Aufgabe

Ziel dieser Aufgabe ist es, eine vorher erstellte App mit dem Firebase Dienst "Test Lab" per automatischen RoboTest testen zu lassen. Anschließend kann evaluiert werden, wie gut automatische Tests mit Firebase funktionieren. Außerdem kann hier gelernt werden, wie man ein Veröffentlichungsformat einer Android App anfertigen kann.

Hierzu muss das Android-Projekt "Uglyplication" von diesem Repository heruntergeladen und in Android Studio geöffnet werden.

## In Android Studio

1. Erstelle ein signiertes Android App Bundle von der App "Uglyplication". 
    - Erstelle dazu einen neuen Key Store Path und vervollständige die zu übergebenen Daten. 
    - Wähle die Build Variante "release" aus.
    - Warte, bis das AAB fertig erstellt wurde und lokalisiere das Verzeichnis, wo das AAB gespeichert wurde.

## In Firebase

Für diesen Aufgabenteil benötigt man ein Google-Konto.

1. Gehe auf die offizielle Website von Firebase und richte ein Firebase Konto ein (klicke auf den Button 'Get Started'): https://firebase.google.com/
2. Erstelle nun ein neues Firebase Projekt. Vegebe einen Projektnamen und wähle aus, ob Google Analytics aktiviert oder deaktiviert werden soll. 
3. Navigiere in der Firebase Console zu den Dienst "Test Lab" im Reiter "Veröffentlichen und Beobachten". 
4. Füge nun deine kürzlich erstellte .AAB-Datei in den Android-Robo-Test hinzu. 
5. Der Test wird nun von einem von Google gehosteten Gerät durchgeführt. Hier kann es bis zu einigen Minuten dauern, bis die Testergebnisse bereit stehen. 

# Die Testergebnisse

Sollte das Testergebnis deines Tests zu spät fertig werden, kannst du folgende Screenshots als Referenzen für die weiteren Aufgaben verwenden: <Screenshots einfügen>
In diesen Aufgabenteil kannst du dir die Analyse-Daten deines durchgeführten Tests ansehen. 

1. Welche Bereiche werden im Test-Ergebnis von "Test Lab" unterteilt bzw. können eingesehen werden?
2. Was für Fehler wurden entdeckt?
3. Was für Fehler wurden nicht entdeckt, könnten allerdings problematisch bezüglich der Benutzbarkeit sein?
4. Wie überzeugend findest du den Dienst "Test Lab" von Firebase?

