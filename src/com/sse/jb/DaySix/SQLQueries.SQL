--1
SELECT NoOfCopies
FROM ( (library.tbl_book NATURAL JOIN library.tbl_book_copies ) NATURAL JOIN library.tbl_library_branch )
WHERE Title='The Lost Tribe' AND BranchName='Sharpstown'

--2
SELECT BranchName, NoOfCopies
FROM ( (library.tbl_book NATURAL JOIN library.tbl_book_copies ) NATURAL JOIN library.tbl_library_branch )
WHERE Title='The Lost Tribe'

--3
SELECT name
FROM `library`.`tbl_borrower` B
WHERE NOT EXISTS ( SELECT *
 FROM library.tbl_BOOK_LOANS L
 WHERE B.CardNo = L.CardNo )

--4
SELECT B.Title, R.Name, R.Address
FROM library.tbl_book B, library.tbl_borrower R, library.tbl_book_loans BL, library.tbl_library_branch LB
WHERE LB.BranchName='Sharpstown' AND LB.BranchId=BL.BranchId AND
BL.DueDate='2021-07-17 00:14:50' AND BL.CardNo=R.CardNo AND BL.BookId=B.BookId

--5
SELECT L.BranchName, COUNT(*)
FROM library.tbl_book_loans B, library.tbl_library_branch L
WHERE B.BranchId = L.BranchId
GROUP BY L.BranchName

--6
SELECT B.Name, B.Address, COUNT(*)
FROM library.tbl_borrower B, library.tbl_book_loans L
WHERE B.CardNo = L.CardNo
GROUP BY B.CardNo
HAVING COUNT(*) > 5

--7
SELECT Title, NoOfCopies, authorId, authorName
FROM ( ( (library.tbl_author NATURAL JOIN library.tbl_BOOK)
NATURAL JOIN library.tbl_book_copies)
NATURAL JOIN library.tbl_LIBRARY_BRANCH)
WHERE authorName = 'Stephen King' and BranchName = 'Central'


