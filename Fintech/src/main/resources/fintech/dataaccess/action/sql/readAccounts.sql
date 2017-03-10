select
    a.account_id
    a.account_name,
     a.type,
    a.balance,
    a.holdings

from
    accounts a

where
    a.userId = (?);