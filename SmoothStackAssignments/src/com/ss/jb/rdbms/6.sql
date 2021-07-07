Select B.name, B.address, count(*) as 'Books Checked Out'
From  tbl_borrower B, tbl_book_loans L
Where L.cardNo = B.cardNo
Group By B.cardNo
Having count(*) > 5