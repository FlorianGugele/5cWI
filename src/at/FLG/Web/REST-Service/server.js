const express = require('express');
const app = express();
const port = 3000;



let people = [
    {name:"daniel", age:18},
    {name:"leto", age:19},
    {name:"willi", age:20},
    {name:"flo", age:19},
    {name:"peter", age:54},
    {name:"gü", age:48},
]
app.get('/people', (req, res) => {
    res.send(people);
});

app.listen(port, () => console.log(`Hello world app listening on port ${port}!`))