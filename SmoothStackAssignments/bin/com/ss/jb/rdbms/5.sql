Select  B.branchName as 'Branch Name', count(*) as 'Number Of Books'
From  tbl_library_branch B, tbl_book_loans L
Where L.branchId = B.branchId
Group By B.branchName
