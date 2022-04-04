### Ülesanne

Ette on antud meetod **eval**, mis väärtustab etteantud avaldise. Parameeter **str** on plusside või miinustega eraldatud
arvude jada, näiteks "5 + 35-  10". Meetodis on aga üks viga. Proovi leida üles viga ja paranda see, kasutades 
mudelipõhist testimist:
1. Kasuta graphwalker studiot, et täiendada olemasolevat mudelit. 
2. Täienda klassi "AnotherSmallTest"
3. Leia üles, millisel juhul **Graphwalkeri** test läbi kukub
4. Paranda meetod **eval**

Tulemusena peaks **Graphwalkeri** teste jooksutades tagastus olema selline:
 
```
{
"totalFailedNumberOfModels": 0,
"totalNotExecutedNumberOfModels": 0,
"totalNumberOfUnvisitedVertices": 0,
"verticesNotVisited": [],
"totalNumberOfModels": 1,
"totalCompletedNumberOfModels": 1,
"totalNumberOfVisitedEdges": 9,
"totalIncompleteNumberOfModels": 0,
"edgesNotVisited": [],
"vertexCoverage": 100,
"totalNumberOfEdges": 9,
"totalNumberOfVisitedVertices": 3,
"edgeCoverage": 100,
"totalNumberOfVertices": 3,
"totalNumberOfUnvisitedEdges": 0
}
```


