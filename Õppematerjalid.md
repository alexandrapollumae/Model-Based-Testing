Näide mudelipõhisest testimisest Graphwalkeril sisselogimise funktsionaalsusest.

Kaustas src/main/java/com/loginExample on java fail LoginFunctionality, kus on lihtne näitekood sisselogimise
funktsionaalsusest. 

Meie esimeseks eesmärgiks on koodiga tutvuda ning sellest teha süsteemi kirjeldav mudel. 
Koodiga tuvudes näeme, et esialgses olekus on kasutaja väljalogitud olekus. Edasi on kolm varianti:
1. Kasutaja sisestab vale kasutajanime ja saab vastava veateate
2. Kasutaja sisestab vale parooli ja saab vastava veateate
3. Kasutaja sisestab õiged sisselogimisandmed, saab vastava veateate ning kasutaja olek muutub sisselogituks

Lisaks saab kasutaja ka välja logida ning jõuab nii tagasi esialgsesse olekusse.

Teeme nüüd sellest GraphWalkeril mudeli:

Selleks paneme tööle graphwalker studio, mis on meil juba alla laetud: 
`$ java -jar ../lib/graphwalker-studio-4.3.1.jar` ja avame studio brauseris: http://localhost:9090/studio.html.

Valime vasakult tööriista ribalt uue faili `+` märgist, kuhu hakkame oma mudelit looma:
![](../../../../../var/folders/x_/s5m1qwkx16sg72f98_8vf3sh0000gn/T/TemporaryItems/NSIRD_screencaptureui_K33jwz/Screenshot 2022-04-11 at 14.06.45.png)

Avame ka vasakult alt menüüst ``Properties`` paneeli ja muudame `"Model" -> "Name"` väljas mudeli nimeks 
"LoginFunctionalityTest".
![](../../../../../var/folders/x_/s5m1qwkx16sg72f98_8vf3sh0000gn/T/TemporaryItems/NSIRD_screencaptureui_24ULVn/Screenshot 2022-04-11 at 14.12.54.png)

Järgmisena loome vastavalt koodile 4 võimalikku olekut ehk tippu ja nende vahele tegevused ehk kaared. Graphwalkeril 
tähistab "vertex" tippu ning "edge" on suunatud kaar. Et luua tipp, hoia all klahvi ``v`` ning tee hiireklõps mudelifailil.
Kahe tipu vahele kaare loomiseks tuleb hoida all klahvi `e` ning tõmmata hiirega ühest tipust teise (suund on oluline).
Et ümbernimetada mudeli element, vajuta sellele ning muuda see `Properties` paneelil  `"Element" -> "Name"` välja all. 
Tulemus peaks olema selline:
![](../../../../../var/folders/x_/s5m1qwkx16sg72f98_8vf3sh0000gn/T/TemporaryItems/NSIRD_screencaptureui_wlxlo9/Screenshot 2022-04-11 at 01.58.28.png)
Oluline on see, et tipul ``v_Login_Page_User_Logged_Out`` oleks sisse lülitatud `Properties` paneelil  `"Element" -> "Start element"`