Select B.title, R.name, R.address
From (((library.tbl_book_loans BL
Inner Join library.tbl_borrower R On BL.cardNo = R.cardNo)
Inner Join library.tbl_book B On BL.bookId = B.bookId)
Inner Join library.tbl_library_branch BR On BL.branchId = BR.branchId)
Where BR.branchName = 'Sharpstown' And date(BL.dueDate) = '2018-04-08'