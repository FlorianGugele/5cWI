const express = require('express');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());
const port = 3000;



let people = [
    {name:"daniel", age:18},
    {name:"leto", age:19},
    {name:"willi", age:20},
    {name:"flo", age:19},
    {name:"peter", age:54},
    {name:"gü", age:48},
]
app.get("/people", (req, res) => {
    res.send(people);
});
app.get("/people/:id", (req, res) => {
    let id = req.params.id;
    res.send(people[id]);
});
app.post("/people", (req, res) => {
    people.push(req.body);

    res.send(req.body);
});

app.delete("/people/:id", (req,res) => {
    let id = req.params.id;
    people.splice(id,1);
    res.send("done");
})

app.listen(port, () => console.log(`Hello world app listening on port ${port}!`))