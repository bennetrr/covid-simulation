# CovidSimulation
Dieses Programm simuliert den Verlauf einer Covid-Ansteckungswelle.

## Installation

### Greenfoot
Als erstes muss Greenfoot installiert werden. Laden Sie dafür Greenfoot herunter (<https://www.greenfoot.org/download>) und installieren Sie es.

### Simulation
Laden Sie die gfar-Datei aus den Releases (<https://github.com/bennetrr/CovidSimulation/releases>) herunter. Wenn Sie Greenfoot installiert haben, können sie einfach die Datei öffnen. Dann öffnet sich die Simulation in Greenfoot.

## Bedienung
### Überblick
![Bild](https://user-images.githubusercontent.com/76742318/122563027-02e75280-d044-11eb-82b4-5e55f0211f21.png)

In Greenfoot ist in der Mitte das Fenster, in dem die Simulation ausgeführt wird (blau umrandet). Unter dem Fenster finden Sie die Buttons zum Starten und Zurücksetzen der Simulation (rot umrandet).

### Konfiguration
Um die Konfiguration zu öffnen, müssen Sie auf die Config-Schaltfläche unten rechts (gelb umrandet) doppelklicken. Dann öffnet sich ein Texteditor, in dem Sie die Einstellungen für die Simulation bearbeiten können.

> WARNUNG!
> Achten Sie darauf, dass Sie keine falschen Werte eintragen oder Sachen löschen, die nicht gelöscht werden sollen!

Ein Eintrag in der Konfiguration sieht zum Beispiel so aus:

```
// The height of the world (default: 500)
public static final int WORLD_HEIGHT = 500;
```
Ein Eintrag besteht aus einer kurzen Beschreibung und einem Standartwert (`//The height of the world (default: 500)`)
Datunter wird der Eintrag festgelegt. Wichtig dabei ist nur der Eigenschaftsname (`WORLD_HEIGHT`) und der Wert (`500`)
Der Rest gehört mit zum System **und darf nicht geändert oder gelöscht werden**.

> WARNUNG!
> Achten Sie darauf, dass Sie bei Zahlen, die im Standardwert als Kommazahlen angegeben werden, auch bei ganzen Zahlen `.0` anhängen. Außerdem muss für statt einem Dezimalkomma einen Dezimalpunkt verwenden!

#### Abschnitt: Spawning
Eigenschaftsname: WORLD_HEIGHT
Beschreibung: Die Höhe der Welt.
Einheit: Pixel
Standardwert: 500
Richtlinien: größer als 0
Warnung: Wenn der Wert zu groß ist, kann die Simulation möglicherweise nicht mehr richtig dargestellt werden.

Eigenschaftsname: WORLD_WIDTH
Beschreibung: Die Breite der Welt.
Einheit: Pixel
Standardwert: 800
Richtlinien: größer als 0
Warnung: Wenn der Wert zu groß ist, kann die Simulation möglicherweise nicht mehr richtig dargestellt werden.

Eigenschaftsname: SPAWNCOUNT_HEALTHY
Beschreibung: Wie viele gesunde Personen auf der Welt sind, bevor die Simulation gestartet wird.
Standardwert: 20
Richtlinien: größer als 0
Warnung: Wenn der Wert zu groß ist, können zu viele Personen auf der Welt sein, was die Simulation unrealistischer machen kann.

Eigenschaftsname: SPAWNCOUNT_INFECTED
Beschreibung: Wie viele infizierte Personen auf der Welt sind, bevor die Simulation gestartet wird.
Standardwert: 1
Richtlinien: größer als 0
Warnung: Wenn der Wert zu groß ist, können zu viele Personen auf der Welt sein, was die Simulation unrealistischer machen kann.

#### Abschnitt: Geschwindigkeit / Gehen
Eigenschaftsname: DEFAULT_SPEED
Beschreibung: Die Standard-Geschwindigkeit der Simulation.
Standardwert: 50
Richtlinien: zwischen 0 und 100
Hinweis: Die Geschwindigkeit wird vor dem Starten der Simulation eingestellt. Sie können die Geschwindigkeit trotzdem während der Simulation ändern.

Eigenschaftsname: WALKING_SPEED
Beschreibung: Die Gehgeschwindigkeit der Personen
Standardwert: 2.5
Richtlinien: größer als 0
Hinweis: Die Geschwindigkeit wird vor dem Starten der Simulation eingestellt. Sie können die Geschwindigkeit trotzdem während der Simulation ändern.

Eigenschaftsname: INFECTION_TIMEOUT
Beschreibung: Die Zeit, die nach einer (fehlgeschlagenen) Infektion gewartet werden soll, um wieder infiziert werden zu können.
Standardwert: 100
Einheit: GameTicks, 125 GameTicks = ca. 1s
Richtlinien: größer als 0

Eigenschaftsname: RANDOM_TURN_CHANCE
Beschreibung: Die Wahrscheinlichkeit, dass sich die Personen zufällig drehen.
Standardwert: 5.0
Richtlinien: zwischen 0 und 100

Eigenschaftsname: RANDOM_TURN_ANGLE
Beschreibung: Der maximale Winkel, den sich die Personen drehen können, wenn sie sich zufällig drehen.
Standardwert: 20
Richtlinien: zwischen 0 und 180

Eigenschaftsname: EDGE_TURN_ANGLE
Beschreibung: Der maximale Winkel, den sich die Personen drehen können, wenn sie vor einer Wand stehen.
Standardwert: 20
Richtlinien: zwischen 0 und 360

Eigenschaftsname: EDGE_TURN_ANGLE
Beschreibung: Der maximale Winkel, den sich die Personen drehen können, wenn sie vor einer Wand stehen.
Standardwert: 20
Richtlinien: zwischen 0 und 360

#### Abschnitt: Alter
Eigenschaftsname: AGE_MIN
Beschreibung: Das minimale Alter, das Personen werden können.
Standardwert: 20
Richtlinien: zwischen 0 und 360




