Select  title, name, address
From (((library.tbl_library_branch Natural Join library.tbl_book_loans) Natural Join library.tbl_borrower) Natural Join library.tbl_book)
 Where branchName = 'Sharpstown' And date(dueDate) = '2018-04-08'
