import java.util.Date

def call(format) {
    d = new Date()
    d.format(format)
    return d
}
