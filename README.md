# AKT-MBT
Mudelipõhise testimise õppematerjalide ja koduülesande loomine aine Automaadid Keeled ja translaatorid jaoks

Kuidas projekti tööle panna:

- Tee uus kaust "MBT"
- Lisa sinna projekt:
  - `https://github.com/alexandrapollumae/MBT-ylesanne.git`
- Tee kausta "MBT" sisse alamkaust "lib"
- Lae alla failid alamkausta lib:
  - https://github.com/GraphWalker/graphwalker-project/releases/download/4.3.1/graphwalker-cli-4.3.1.jar
  - https://github.com/GraphWalker/graphwalker-project/releases/download/4.3.1/graphwalker-studio-4.3.1.jar
  

- Genereeri test juhud (Test cases):
  - `$ java -jar ../lib/graphwalker-cli-4.3.1.jar offline -m src/main/resources/com/company/HtmlStrip.json "random(edge_coverage(100))" | jq '.currentElementName'`


- Testide jooksutamiseks lubage väited (assertions):
  - `$ export MAVEN_OPTS="-ea"`


- Jooksuta testid:
  - `$ mvn clean graphwalker:generate-sources compile exec:java -Dexec.mainClass="com.company.Runner"`
