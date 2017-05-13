<h2><b>Compare The Triplets</b></h2>

We define the rating for Alice's challenge to be the triplet <b>A=(a<sub>0</sub>,a<sub>1</sub>,a<sub>2</sub>)</b>, and the rating for Bob's challenge to be the triplet <b>B=(b<sub>0</sub>,b<sub>1</sub>,b<sub>2</sub>)</b>.

Your task is to find their comparison points by comparing <b>a<sub>0</sub></b> with <b>b<sub>0</sub></b>, <b>a<sub>1</sub></b> with <b>b<sub>1</sub></b>, and <b>a<sub>2</sub></b> with <b>b<sub>2</sub></b>. 

&#8226; if <b>a<sub>i</sub></b> > <b>b<sub>i</sub></b>, then <b>Alice</b> is awarded <b>1</b> point<br>
&#8226; if <b>a<sub>i</sub></b> < <b>b<sub>i</sub></b>, then <b>Bob</b> is awarded <b>1</b> point<br>
&#8226; if <b>a<sub>i</sub></b> = <b>b<sub>i</sub></b>, then neither person receives a point<br>

Comparison points is the total points a person earned.
Given <b>A</b> and <b>B</b>, can you compare the two challenges and print their respective comparison points?

<h2>Input Format</h2>
The first line contains space-separated integers, <b>a<sub>0</sub>,a<sub>1</sub>,a<sub>2</sub></b>, describing the respective values in triplet <b>A</b>.<br>
The second line contains space-separated integers, <b>b<sub>0</sub>,b<sub>1</sub>,b<sub>2</sub></b>, describing the respective values in triplet <b>B</b>.

<h2>Constraints</h2>
1 &le; a<sub>i</sub> &le; 100<br>
1 &le; b<sub>i</sub> &le; 100<br>

<h2>Output Format</h2>
Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.<br>

<h2>Sample Input</h2>
5 6 7<br>
3 6 10<br>

<h2>Sample Output</h2>
1 1<br>

<h2>Explanation</h2>
In this example:<br>
&#8226; <b>A</b>=(a<sub>0</sub>,a<sub>1</sub>,a<sub>2</sub>)=(5,6,7)<br>
&#8226; <b>B</b>=(b<sub>0</sub>,b<sub>1</sub>,b<sub>2</sub>)=(3,6,10)<br>
Now, let's compare each individual score:<br>
&#8226; <b>a<sub>0</sub> > b<sub>0</sub></b>, so <b>Alice</b> receives 1 point<br>
&#8226; <b>a<sub>1</sub> = b<sub>1</sub></b>, so nobody receives a point<br>
&#8226; <b>b<sub>2</sub> > a<sub>2</sub></b>, so <b>Bob</b> receives 1 point<br>

