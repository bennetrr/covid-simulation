# CovidSimulation
Dieses Programm simuliert den Verlauf einer Covid-Ansteckungswelle.

## Installation
Als erstes muss Greenfoot (<https://www.greenfoot.org/download>) installiert werden. Laden Sie dann die gfar-Datei aus den Releases (<https://github.com/bennetrr/CovidSimulation/releases>) herunter. Wenn Sie Greenfoot installiert haben, können sie einfach die Datei öffnen. Dann öffnet sich die Simulation in Greenfoot.

## Bedienung
### Überblick
<img alt="Oberfläche von Greenfoot" src="https://user-images.githubusercontent.com/76742318/122647173-246b3b80-d123-11eb-851b-9034399983da.png">

In Greenfoot ist in der Mitte das Fenster, in dem die Simulation ausgeführt wird (blau umrandet), hier "die Welt" genannt. Unter dem Fenster finden sich Buttons zum Starten und Zurücksetzen der Simulation (rot umrandet).

### Konfiguration
Um die Konfiguration zu öffnen, müssen Sie auf die Config-Schaltfläche unten rechts (grün umrandet) doppelklicken. Dann öffnet sich ein Texteditor, in dem Sie die Einstellungen und Parameter für die Simulation bearbeiten können.

> WARNUNG!
> Achten Sie darauf, dass Sie keine falschen Werte eintragen oder Sachen löschen, die nicht gelöscht werden sollen!

Ein Eintrag in der Konfiguration sieht zum Beispiel so aus:

```
// The height of the world (default: 500)
public static final int WORLD_HEIGHT = 500;
```
Ein Eintrag besteht aus einer kurzen Beschreibung und einem Standartwert (`//The height of the world (default: 500)`).
Datunter wird der Eintrag festgelegt. Wichtig dabei ist nur der Eigenschaftsname (`WORLD_HEIGHT`) und der Wert (`500`).<br>
Nur der Wert darf geändert werden. Der Rest gehört mit zum System **und darf nicht geändert oder gelöscht werden**.

> WARNUNG!
> Achten Sie darauf, dass Sie bei Zahlen, die im Standardwert als Kommazahlen angegeben sind, `.0` anhängen, auch wenn die Zahl keine Nachkommastelle hat. Außerdem muss statt einem Dezimalkomma einen Dezimalpunkt verwendet werden!

#### Abschnitt: Spawning
Eigenschaftsname: `WORLD_HEIGHT`<br>
Beschreibung: Die Höhe der Welt.<br>
Einheit: Pixel<br>
Standardwert: 500<br>
Richtlinien: größer als 0<br>
Warnung: Wenn der Wert zu groß ist, kann die Simulation möglicherweise nicht mehr richtig dargestellt werden!<br>

Eigenschaftsname: `WORLD_WIDTH`<br>
Beschreibung: Die Breite der Welt.<br>
Einheit: Pixel<br>
Standardwert: 800<br>
Richtlinien: größer als 0<br>
Warnung: Wenn der Wert zu groß ist, kann die Simulation möglicherweise nicht mehr richtig dargestellt werden!<br>

Eigenschaftsname: `SPAWNCOUNT_HEALTHY`<br>
Beschreibung: Wie viele gesunde Personen auf der Welt sind, wenn die Simulation gestartet wird.<br>
Standardwert: 20<br>
Richtlinien: größer als 0<br>
Warnung: Wenn der Wert zu groß ist, können zu viele Personen auf der Welt sein, was die Simulation unrealistischer und unübersichtlicher macht.<br>

Eigenschaftsname: `SPAWNCOUNT_INFECTED`<br>
Beschreibung: Wie viele infizierte Personen auf der Welt sind, bevor die Simulation gestartet wird.<br>
Standardwert: 1<br>
Richtlinien: größer als 0<br>
Warnung: Wenn der Wert zu groß ist, können zu viele Personen auf der Welt sein, was die Simulation unrealistischer und unübersichtlicher macht.<br><br>

#### Abschnitt: Geschwindigkeit / Gehen
Eigenschaftsname: `DEFAULT_SPEED`<br>
Beschreibung: Die Standard-Geschwindigkeit der Simulation.<br>
Standardwert: 50<br>
Richtlinien: zwischen 0 und 100<br>
Hinweis: Die Geschwindigkeit wird vor dem Starten der Simulation eingestellt. Sie können die Geschwindigkeit trotzdem während der Simulation ändern.<br>

Eigenschaftsname: `WALKING_SPEED`<br>
Beschreibung: Die Gehgeschwindigkeit der Personen.<br>
Standardwert: 2.5<br>
Richtlinien: größer als 0<br>

Eigenschaftsname: `INFECTION_TIMEOUT`<br>
Beschreibung: Die Zeit, die nach einer (fehlgeschlagenen) Infektion gewartet werden soll, um wieder infiziert werden zu können.<br>
Standardwert: 100<br>
Einheit: 125 GameTicks = ca. 1s<br>
Richtlinien: größer als 0<br>

Eigenschaftsname: `RANDOM_TURN_CHANCE`<br>
Beschreibung: Die Wahrscheinlichkeit, dass sich die Personen zufällig drehen.<br>
Standardwert: 5.0<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: `RANDOM_TURN_ANGLE`<br>
Beschreibung: Der maximale Winkel, um den sich die Personen bei einer zufälligen Drehung drehen können.<br>
Standardwert: 20<br>
Richtlinien: zwischen 0 und 180<br>

Eigenschaftsname: `EDGE_TURN_ANGLE`<br>
Beschreibung: Der Winkel, um den sich die Personen drehen, wenn sie vor einer Wand stehen.<br>
Standardwert: 20<br>
Richtlinien: zwischen 0 und 360<br>

Eigenschaftsname: `EDGE_TURN_ANGLE`<br>
Beschreibung: Der maximale Winkel, den sich die Personen drehen können, wenn sie vor einer Wand stehen.<br>
Standardwert: 20<br>
Richtlinien: zwischen 0 und 360<br><br>

#### Abschnitt: Alter
Eigenschaftsname: `AGE_MIN`<br>
Beschreibung: Das minimale Alter, das Personen werden können.<br>
Standardwert: 0<br>
Richtlinien: größer oder gleich 0<br>

Eigenschaftsname: `AGE_MAX`<br>
Beschreibung: Das maximale Alter, das Personen werden können.<br>
Standardwert: 100<br>
Richtlinien: größer als `AGE_MIN`<br>

Eigenschaftsname: `MAX_CHILD_AGE`<br>
Beschreibung: Das maximale Alter, um als Kind zu gelten.<br>
Standardwert: 18<br>
Richtlinien: zwischen `AGE_MIN` und `AGE_MAX`<br><br>

#### Abschnitt: Wahrscheinlichkeiten
Eigenschaftsname: `R0`<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person älter als MAX_CHILD_AGE eine andere Person infiziert.<br>
Standardwert: 1.0<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: `Rchild`<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person jünger als `MAX_CHILD_AGE` eine andere Person infiziert.<br>
Standardwert: 0.2<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: `INCUBATION_TIME`<br>
Beschreibung: Die Zeit, die es dauert, bis eine infizierte Person Symptome zeigt.<br>
Standardwert: 1750<br>
Einheit: 125 GameTicks = ca. 1s<br>
Richtlinien: größer als 0<br>

Eigenschaftsname: `I_IMMUITY_CHANCE`<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person nach einer Infektion immun wird.<br>
Standardwert: 8.0<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: `DEASESE_CHANCE`<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person nach einer Infektion erkrank.<br>
Standardwert: 5.0<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: `DEASESE_TIME`<br>
Beschreibung: Wie lange eine Covid-Krankheit dauert.<br>
Standardwert: 1500<br>
Einheit: 125 GameTicks = ca. 1s<br>
Richtlinien: größer als 0<br>

Eigenschaftsname: `S_IMMUITY_CHANCE`<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person, nachdem sie krank war, immun wird.<br>
Standardwert: 5.0<br>
Richtlinien: zwischen 0 und 100<br>

Eigenschaftsname: `DEATH_CHANCE`<br>
Beschreibung: Die Wahrscheinlichkeit, dass eine Person, nachdem sie krank war, stirbt.<br>
Standardwert: 4.0<br>
Richtlinien: zwischen 0 und 100<br><br>

#### Abschnitt: Infektionsschutz
Eigenschaftsname: `DO_QUARANTINE`<br>
Beschreibung: Ob kranke Personen in Quarantäne gesteckt werden sollen.<br>
Standardwert: false<br>
Richtlinien: `true` (ja) oder `false` (nein)<br>

### Verlauf der Simulation
Am Anfang der Simulation werden die Personen mit einem zufälligen Alter in die Welt gesetzt (gespawnt). Es wird eine oder mehrere (siehe Konfiguration) infizierte Personen gespawnt. Wenn Sie die Simulation starten, laufen die Personen auf der Welt hin und her. Dabei stecken die Infizierten gesunde Personen an, welche dann selbst infizieren können. Nach einer bestimmten Zeit, der Inkubationszeit, werden die infizierten dann entweder immun oder krank. Das Alter der Personen spielt bei den meisten Entscheidungen eine Rolle. Zum Beispiel werden ältere Personen öfters krank als jüngere und sind auch ansteckender.
Wenn Quarantäne aktiviert ist, können sich kranke Personen nicht mehr bewegen und auch niemanden mehr anstecken, die infizierten aber schon. Nach einer bestimmten Zeit krank-sein können die Personen entweder immun werden oder sterben. Die Simulation ist zu Ende, wenn es keine infizierten oder kranken Personen mehr gibt.

### Visualisierung
Zum Start der Simulation werden oben in der Welt die Counter eingerichtet, an denen Sie sehen können, wie viel Infizierte, Kranke, Gesunde usw. es in der Welt gibt. Die Counter haben die gleichen Farben der jeweiligen Personengruppe:
- Grün: Gesund
- Orange: Infiziert
- Rot: Erkrankt
- Blau: Immun
- Grau: Tot

Außerdem gibt es eine Meldung im Terminalfenster, wenn eine Person infiziert oder gesund wird, erkrankt usw. Das Terminalfenster sollte automatisch aufgehen, wenn die Simulation gestartet wird.

## Schlusswort
Diese Simulation besteht hauptsächlich darin, an der Konfiguration rumzustellen und zu gucken, was bei welchem Parameter passiert und wie sich der Virus ausbreitet. Man kann auch das Projekt zwei mal nebeneinander starten (dazu einfach den Ordner mit dem Projekt kopieren und in Greenfoot öffnen) und die Verläufe vergleichen.
Die Simulation wurde im Rahmen des Informatikunterrichts in der Schule programmiert. Wenn Sie einen Fehler bei der Simulation feststellen, können Sie ihn gerne hier bei GitHub im Issue Tracker melden. Gleiches gilt auch für Funktionsvorschläge. Aber nein, eine Config-UI wird es nicht geben :D
