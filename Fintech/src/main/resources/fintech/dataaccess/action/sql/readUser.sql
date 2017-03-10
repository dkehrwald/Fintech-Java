select
    u.firstName,
    u.lastName,
    u.email,
    u.phone

from
    users u

where
    u.userId = (?)