
Select cardNo
From library.tbl_borrower
Where cardNo Not In (Select cardNo From library.tbl_book_loans);

