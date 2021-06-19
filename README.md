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
Ein Eintrag besteht aus einer kurzen Beschreibung und einem Standartwert (`//The height of the world (default: 500)`).<br>
Datunter wird der Eintrag festgelegt. Wichtig dabei ist nur der Eigenschaftsname (`WORLD_HEIGHT`) und der Wert (`500`).<br>
Nur der Wert darf geändert werden. Der Rest gehört mit zum System **und darf nicht geändert oder gelöscht werden**.

> WARNUNG!
> Achten Sie darauf, dass Sie bei Zahlen, die im Standardwert als Kommazahlen angegeben werden, auch bei ganzen Zahlen `.0` anhängen. Außerdem muss für statt einem Dezimalkomma einen Dezimalpunkt verwenden!

<br>
#### Abschnitt: Spawning
Eigenschaftsname: WORLD_HEIGHT<br>
Beschreibung: Die Höhe der Welt.<br>
Einheit: Pixel<br>
Standardwert: 500<br>
Richtlinien: größer als 0<br>
Warnung: Wenn der Wert zu groß ist, kann die Simulation möglicherweise nicht mehr richtig dargestellt werden.<br>

Eigenschaftsname: WORLD_WIDTH<br>
Beschreibung: Die Breite der Welt.<br>
Einheit: Pixel<br>
Standardwert: 800<br>
Richtlinien: größer als 0<br>
Warnung: Wenn der Wert zu groß ist, kann die Simulation möglicherweise nicht mehr richtig dargestellt werden.<br>

Eigenschaftsname: SPAWNCOUNT_HEALTHY<br>
Beschreibung: Wie viele gesunde Personen auf der Welt sind, bevor die Simulation gestartet wird.<br>
Standardwert: 20<br>
Richtlinien: größer als 0<br>
Warnung: Wenn der Wert zu groß ist, können zu viele Personen auf der Welt sein, was die Simulation unrealistischer machen kann.<br>

Eigenschaftsname: SPAWNCOUNT_INFECTED<br>
Beschreibung: Wie viele infizierte Personen auf der Welt sind, bevor die Simulation gestartet wird.<br>
Standardwert: 1<br>
Richtlinien: größer als 0<br>
Warnung: Wenn der Wert zu groß ist, können zu viele Personen auf der Welt sein, was die Simulation unrealistischer machen kann.<br><br>

#### Abschnitt: Geschwindigkeit / Gehen
Eigenschaftsname: DEFAULT_SPEED<br>
Beschreibung: Die Standard-Geschwindigkeit der Simulation.<br>
Standardwert: 50<br>
Richtlinien: zwischen 0 und 100<br>
Hinweis: Die Geschwindigkeit wird vor dem Starten der Simulation eingestellt. Sie können die Geschwindigkeit trotzdem während der Simulation ändern.<br>

Eigenschaftsname: WALKING_SPEED<br>
Beschreibung: Die Gehgeschwindigkeit der Personen.<br>
Standardwert: 2.5<br>
Richtlinien: größer als 0<br>

Eigenschaftsname: INFECTION_TIMEOUT<br>
Beschreibung: Die Zeit, die nach einer (fehlgeschlagenen) Infektion gewartet werden soll, um wieder infiziert werden zu können.<br>
Standardwert: 100<br>
Einheit: 125 GameTicks = ca. 1s<br>
Richtlinien: größer als 0<br>

Eigenschaftsname: RANDOM_TURN_CHANCE<br>
Beschreibung: Die Wahrscheinlichkeit, dass sich die Personen zufällig drehen.<br>
Standardwert: 5.0<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: RANDOM_TURN_ANGLE<br>
Beschreibung: Der maximale Winkel, den sich die Personen drehen können, wenn sie sich zufällig drehen.<br>
Standardwert: 20<br>
Richtlinien: zwischen 0 und 180<br>

Eigenschaftsname: EDGE_TURN_ANGLE<br>
Beschreibung: Der maximale Winkel, den sich die Personen drehen können, wenn sie vor einer Wand stehen.<br>
Standardwert: 20<br>
Richtlinien: zwischen 0 und 360<br>

Eigenschaftsname: EDGE_TURN_ANGLE<br>
Beschreibung: Der maximale Winkel, den sich die Personen drehen können, wenn sie vor einer Wand stehen.<br>
Standardwert: 20<br>
Richtlinien: zwischen 0 und 360<br><br>

#### Abschnitt: Alter
Eigenschaftsname: AGE_MIN<br>
Beschreibung: Das minimale Alter, das Personen werden können.<br>
Standardwert: 0<br>
Richtlinien: größer oder gleich 0<br>

Eigenschaftsname: AGE_MAX<br>
Beschreibung: Das maximale Alter, das Personen werden können.<br>
Standardwert: 100<br>
Richtlinien: größer als AGE_MIN<br>

Eigenschaftsname: MAX_CHILD_AGE<br>
Beschreibung: Das maximale Alter, um als Kind zu gelten.<br>
Standardwert: 18<br>
Richtlinien: zwischen AGE_MIN und AGE_MAX<br><br>

#### Abschnitt: Wahrscheinlichkeiten
Eigenschaftsname: R0<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person älter als MAX_CHILD_AGE eine andere Person infiziert.<br>
Standardwert: 1.0<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: Rchild<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person jünger als MAX_CHILD_AGE eine andere Person infiziert.<br>
Standardwert: 0.2<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: INCUBATION_TIME<br>
Beschreibung: Die Zeit, die es dauert, bis eine infizierte Person Symptome zeigt.<br>
Standardwert: 1750<br>
Einheit: 125 GameTicks = ca. 1s<br>
Richtlinien: größer als 0<br>

Eigenschaftsname: I_IMMUITY_CHANCE<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person nach einer Infektion immun wird.<br>
Standardwert: 8.0<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: DEASESE_CHANCE<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person nach einer Infektion krank wird.<br>
Standardwert: 5.0<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: DEASESE_TIME<br>
Beschreibung: Wie lang eine Covid-Krankheit dauert.<br>
Standardwert: 1500<br>
Einheit: 125 GameTicks = ca. 1s<br>
Richtlinien: größer als 0<br>

Eigenschaftsname: S_IMMUITY_CHANCE<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person, nachdem sie krank war, immun wird.<br>
Standardwert: 5.0<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: DEATH_CHANCE<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person, nachdem sie krank war, stirbt.<br>
Standardwert: 4.0<br>
Richtlinien: zwischen 0 und 100<br><br>

#### Abschnitt: Infektionsschutz
Eigenschaftsname: DO_QUARANTINE<br>
Beschreibung: Ob kranke Personen in Quarantäne gesteckt werden sollen.<br>
Standardwert: false<br>
Richtlinien: `true` (ja) oder `false` (nein)<br>
