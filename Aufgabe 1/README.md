# Aufgabe 1
## Ziel der Aufgabe
In dieser Aufgabe soll eine rudimentäre Beispiel-App "weiterentwickelt" werden, um einigen Punkten auf der [Android Core Qualitätsanforderungen](https://developer.android.com/docs/quality-guidelines/core-app-quality) zu befolgen.

## Audio Playback
Die App spielt während ihrer Laufzeit mithilfe eines [MediaPlayers](https://developer.android.com/reference/android/media/MediaPlayer) Audio ab. Diese soll als Hintergrundmusik für das "Spiel" fungieren.
1. Beobachte das Verhalten der Musik beim Öffnen und Schießen der App. Welches Verhalten verstößt hier gegen die Qualitätsanforderungen?
2. Behebe das Fehlverhalten (Tipp: OnPause(), OnResume())

## Lokalisierung
Damit sich das Spiel auf dem Internationalen Markt durchsetzt, soll eine englische Übersetzung angefertigt werden. Diese soll bei Geräten, deren Systemsprache English ist anstelle der Standard-Strings angezeigt werden.
1. Öffne values/strings.xml. Verlagere alle UI-Strings in diese Datei (aber ändere sie vorerst nicht ab)
2. Öffne den Translations Editor: Rechtsklick auf strings.xml -> Open Translations Editor
3. Klicke auf das Erdkugel Icon und füge "English (en)" als neues locale hinzu
4. Übersetze die Strings und beobachte das Ergebnis im Emulator

## Sharesheet
Spieler, die das Spiel gewonnen haben sollen die Möglichkeit bekommen, ihren Sieg mit ihren Freunden zu teilen. Die etablierte Lösung hier ist [Android ShareSheet](https://developer.android.com/training/sharing/send).
1. Erstelle einen neuen Button in der WinActivity
2. Erzeuge beim Antippen des Buttons mithilfe von ShareSheet einen Share Intent, der den String "Ich habe gewonnen!!" teilbar macht (sieh dir dazu den obigen Link an)
