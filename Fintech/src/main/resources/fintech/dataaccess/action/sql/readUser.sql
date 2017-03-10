select
    u.firstName,
    u.lastName,
    u.email,
    u.phone
    u.userId

from
    users u

where
    u.userId = (?);