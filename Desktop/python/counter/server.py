from flask import Flask,render_template, redirect,session
app = Flask(__name__)
app.secret_key = "KEY_KEY_KEY"

@app.route('/')
def index():

    if "counter" not in session:
        session["counter"] = 0


    session["counter"] += 1
    return render_template("index.html")
@app.route('/plus_2')
def go_up_by_two():
    if "counter" not in session:
        session["counter"] = 0
    session["counter"] = 1
    return redirect('/')
    @app.route('/reset')
    def reset():
        session["counter"] = 0
        return redirect('/')
        









        return render_template("index.html")

app.run(debug=True)
