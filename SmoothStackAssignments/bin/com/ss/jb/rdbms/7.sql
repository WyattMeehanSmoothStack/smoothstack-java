Select  B.title, C.noOfCopies
From (((tbl_author A
Inner Join tbl_book B On A.authorId = B.authId)
Inner Join tbl_book_copies C On C.bookId = B.bookId)  
Inner Join tbl_library_branch R On C.branchId = R.branchId)
Where A.authorName = 'Stephen King'  And R.branchName = 'Central'