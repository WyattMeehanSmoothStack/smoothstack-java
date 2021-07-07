Select branchName, noOfCopies
From ((library.tbl_book Natural Join library.tbl_book_copies) Natural Join library.tbl_library_branch)
 Where branchName = 'Sharpstown' And title = 'The Lost Tribe';
 
