# Musterlösung Aufgabe 2

## Die Testergebnisse

Die folgenden Testergebnisse entstammen einem Robo-Test von Firebase Test-Lab mit einem **Pixel 5e, API-Ebene 30**. 

1. _Welche Bereiche werden im Test-Ergebnis von "Test Lab" unterteilt bzw. können eingesehen werden?_
   Testergebnisse aus dem “Test Lab” von Firebase werden in folgende Bereiche unterteilt:
   - **Testprobleme**: Hier wird angezeigt, ob die App kritische Fehler enthält, die zum Absturz führen könnten
   - **Robo**: Hier werden die Aktionspfade der App durch sogenante "Crawling-Pfade" simuliert, um zu evaluieren, ob jede Activity und Funktionalität der App erreichbar ist. 
   - **Logs**: Interne Log-Aufzeichnungen der App vom gehosteten Gerät
   - **Screenshots**: Aufzählung der Screenshots aller Activities
   - **Videos**: Video-Aufzeichnung der "Crawling-Pfade"
   - **Leistung**: Statistische Auswertung der genutzten Ressourcen (CPU,RAM, Netzwerkauslastung) des Smartphones während App-Nutzung
   - **Bedienungshilfen**: Hier stehen Hinweise zu Kontrast-Problemen bei Text/Hintergrund-Elementen

2. _Was für Fehler wurden entdeckt?_
   - App-Absturz durch Runtime-Exception, bzw. Button-Klick
3. _Was für Fehler wurden nicht entdeckt, könnten allerdings problematisch bezüglich der Benutzbarkeit sein?_
   - Geringe Farbkontraste zwischen Textfarbe und Hintergundfarbe (1,34 : 1)
   - UI-Elemente befinden sich außerhalb des Bildschirmbereichs
   - UI-Elemente überlagern sich gegenseitig

4. _Welche Daten der Testergebnisse kannst du bezüglich der Performance der App auslesen?_
   - App-Startzeit 327 ms
   - CPU Auslastung bei der Startzeit am höchsten (~12%)

5. _Wie überzeugend findest du den Dienst "Test Lab" von Firebase?_
   Nach unserer Auffassung kann der Dienst "Test Lab" von Firebase höchstens in frühen Phasen der App-Testung eingesetzt werden. Es werden grobe und kritische Fehler erkannt, die dann beseitigt werden können, ohne dass eine echte Testperson diesen Fehler entdecken brauchte. Je nach Gerät sind die Testergebnisse unterschiedlich. So hat dieser Test mit einem Pixel 5e keine Änderungen zur Bedienungshilfe vorgeschlagen, obwohl der Text-Farb-Kontrast deutlich unter den Google App Core Standards liegen. _Bei kleineren Text (< 18pt) sollte der Text-Farb-Kontrast mindestens bei 4,5:1 liegen._ Andere, ältere Geräte erkennen gar nicht erst bestimmte UI-Elemente. 
   Aus diesen Defiziten können wir schlussfolgern, dass automatische App-Tests keine herkömmlichen bislang ersetzen können. 
