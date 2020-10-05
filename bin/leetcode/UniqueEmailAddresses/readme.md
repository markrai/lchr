Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? 

 

# Example 1:

Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
 
# Note:

1 <= emails[i].length <= 100
1 <= emails.length <= 100
Each emails[i] contains exactly one '@' character.
All local and domain names are non-empty.
Local names do not start with a '+' character


# Implementation:

The first thing that I did was to decide on what type of datastructure is going to hold my values (valid e-mails).

Since we're dealing with "uniqueness," the logical choice would be a set, which does not allow duplicate values.

The first step in the iteration involves splitting the e-mail into 2 parts. "local" and "domain" on the @ symbol.

String[] parts = input[i].split("@");

Here we assign this split into an array of Strings.

So that 

parts[0] = sambiggins
parts[1] = mail.com

We then process "parts[0]"  // the first part of the e-mail.

We remove all dots. 
`local = parts[0].replaceAll("\\.", "");`

We remove all characters after a "+"
`local = local.split("\\+")[0];`

We add the "@" back which was initially removed in the split.
`local = local + "@";`

We finish up by setting the value of "domain"
`domain = parts[1];`

We try to add the value "local+domain" to our collection: validEmails.
`validEmails.add(local + domain);`

Finally, we return the size.
`return validEmails.size();`
