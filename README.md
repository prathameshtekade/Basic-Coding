# Basic-Coding
Normalization:-
organizing data in database it is a systematic approach of decomposing 
tables to eleminate data redundancy it is a multi step process to 
eliminate that puts data in tabular form removing duplicated data 
from its relational database.

uses:-
--It is used to eleminate repeated data in a system.

1Nf:-
1)Every cell should have only one values.
2)Unique names for attributes/columns.
3)Order Doesn't Matter.

2NF:-
1)A Table Should be in 2NF
2)No Partial Dependency

Fuctional Dependency:-All columns are dependent on one primary Key.
Partial Dependency:-When there are one or more primary key in one 
table(Candidate Key).
--Any attribute/coulumn depend on a part of primary key is known
as partial dependency.

3NF:-
1)Table should be in 2NF.
2)No Transitive dependency:-means When one column depends on a column 
which is not primary key.

BCNF:-
1)Table should be in 3NF.
2)BCNF Doesn't allow non prime attribute depends on prime attributes. 
