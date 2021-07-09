Select branchName, noOfCopies
From (((library.tbl_book B
Inner Join library.tbl_book_copies C On B.bookId = C.bookId)
Inner Join library.tbl_library_branch L On C.branchId = L.branchId))
Where B.title = 'The Lost Tribe'